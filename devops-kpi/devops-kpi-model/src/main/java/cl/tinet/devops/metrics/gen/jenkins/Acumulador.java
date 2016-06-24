package cl.tinet.devops.metrics.gen.jenkins;

public class Acumulador {

	private String nombre;

	private double suma;

	private int cantidad;

	public Acumulador(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public double getSuma() {
		return suma;
	}

	public int getCantidad() {
		return cantidad;
	}

	public double getPromedio() {
		if (cantidad == 0) {
			return 0.0;
		}
		return suma / cantidad;
	}

	public void agregar(double item) {
		cantidad++;
		suma += item;
	}

	public void agregar(Acumulador items) {
		cantidad += items.cantidad;
		suma += items.suma;
	}

	public void sustraer(double item) {
		cantidad--;
		suma -= item;
	}

	public void sustraer(Acumulador items) {
		cantidad -= items.cantidad;
		suma -= items.suma;
	}
}
