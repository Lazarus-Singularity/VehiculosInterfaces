package vehiculos;

public class Terrestre extends Vehiculo implements Motor {

	public Terrestre(int velocidadActual, int velocidadMaxima, String tipoVehiculo) {
		super(velocidadActual, velocidadMaxima, tipoVehiculo);
	}

	@Override
	public int calcularRevolucionesMotor(int fuerza, int radio) {
		return this.Accum = Motor.super.calcularRevolucionesMotor(fuerza, radio);
	}

	@Override
	public void imprimir() {

		System.out.println("Vehiculo Terrestre");
		super.imprimir();
		System.out.println("Revoluciones del motor: " + this.Accum);

	}

}
