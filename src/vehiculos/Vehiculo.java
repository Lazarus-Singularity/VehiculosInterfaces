package vehiculos;

public abstract class Vehiculo {

	protected int velocidadActual;
	protected int velocidadMaxima;
	protected int Accum = 0;
	protected String tipoVehiculo;

	public Vehiculo(int velocidadActual, int velocidadMaxima, String tipoVehiculo) {
		this.velocidadActual = velocidadActual;
		this.velocidadMaxima = velocidadMaxima;
		this.tipoVehiculo = tipoVehiculo;
	}

	public void imprimir() {

		System.out.println("El tipo de vehiculo es " + this.tipoVehiculo);
		System.out.println("Velocidad actual = " + this.velocidadActual);
		System.out.println("Velocidad maxima = " + this.velocidadMaxima);

	}

	public void acelerar() {

		System.out.println("El vehiculo esta acelerando");

	}

	public void frenar() {

		System.out.println("El vehiculo esta frenando");

	}

}
