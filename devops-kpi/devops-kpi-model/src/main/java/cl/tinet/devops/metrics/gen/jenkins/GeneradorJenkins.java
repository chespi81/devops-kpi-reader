package cl.tinet.devops.metrics.gen.jenkins;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import cl.tinet.devops.metrics.gen.Generador;
import cl.tinet.devops.metrics.gen.GeneradorException;
import cl.tinet.devops.metrics.gen.ParametroRequeridoException;
import cl.tinet.devops.metrics.model.GeneradorKPI;
import cl.tinet.devops.metrics.model.Parametro;
import cl.tinet.devops.metrics.util.DevOpsUtil;

import com.offbytwo.jenkins.JenkinsServer;

public abstract class GeneradorJenkins implements Generador {

	public static final String LLAVE_SERVIDOR_JENKINS = "SERVIDOR_JENKINS";

	public static final String LLAVE_INDICADOR_AUTENTICACION = "INDICADOR_AUTENTICACION";

	public static final String LLAVE_USUARIO_JENKINS = "USUARIO_JENKINS";

	public static final String LLAVE_PASSWORD_JENKINS = "PASSWORD_JENKINS";

	private String nombre;

	private String servidor;

	private boolean autenticado = true;

	private String username;

	private String password;

	public String getNombre() {
		return nombre;
	}

	public void inicializar(GeneradorKPI config) throws GeneradorException {
		Map<String, Parametro> parametros = DevOpsUtil.getParametros(config
				.getParametros());
		nombre = config.getNombre();
		servidor = DevOpsUtil.getString(LLAVE_SERVIDOR_JENKINS, parametros);
		if (servidor == null) {
			throw new ParametroRequeridoException(LLAVE_SERVIDOR_JENKINS);
		}
		Boolean valor = DevOpsUtil.getBoolean(LLAVE_INDICADOR_AUTENTICACION,
				parametros);
		if (valor != null) {
			autenticado = valor.booleanValue();
		}
		if (autenticado) {
			username = DevOpsUtil.getString(LLAVE_USUARIO_JENKINS, parametros);
			password = DevOpsUtil.getString(LLAVE_PASSWORD_JENKINS, parametros);
			if (username == null) {
				throw new ParametroRequeridoException(LLAVE_USUARIO_JENKINS);
			}
			if (password == null) {
				throw new ParametroRequeridoException(LLAVE_PASSWORD_JENKINS);
			}
		}
	}

	public JenkinsServer getJenkinsServer() throws URISyntaxException {
		JenkinsServer server = null;
		URI uri = new URI(servidor);
		if (autenticado) {
			server = new JenkinsServer(uri, username, password);
		} else {
			server = new JenkinsServer(uri);
		}
		return server;
	}
}
