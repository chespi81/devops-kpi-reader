package cl.tinet.devops.metrics;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import cl.tinet.devops.metrics.model.ConfiguracionGeneral;

/**
 * Hello world!
 * 
 */
public class App {

	public static void main(String[] args) throws URISyntaxException,
			IOException, JAXBException {
		JAXBContext jc = JAXBContext.newInstance(ConfiguracionGeneral.class);

		Unmarshaller unmarshaller = jc.createUnmarshaller();
		ConfiguracionGeneral config = (ConfiguracionGeneral) unmarshaller
				.unmarshal(new File("src/nov18/input.xml"));

		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(config, System.out);

		// JenkinsServer jenkins = new JenkinsServer(new URI(
		// "http://10.7.3.5:8080"), "rsanmartin", "Lenovo8159");
		// Map<String, Job> jobs = jenkins.getJobs();
		// for (Entry<String, Job> entry : jobs.entrySet()) {
		// JobWithDetails job = jenkins.getJob(entry.getKey());
		// System.out.println(entry.getKey() + ": " + job);
		// Optional<FolderJob> fj = jenkins.getFolderJob(job);
		// if (fj.isPresent()) {
		// Map<String, Job> subJobs = fj.get().getJobs();
		// for (Entry<String, Job> subJob : subJobs.entrySet()) {
		// System.out.print(subJob.getKey() + ",");
		// }
		// System.out.println();
		// }
		// }
	}
}
