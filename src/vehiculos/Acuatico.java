package vehiculos;

public class Acuatico extends Vehiculo implements Motor, Vela {

	public Acuatico(int velocidadActual, int velocidadMaxima, String tipoVehiculo) {
		super(velocidadActual, velocidadMaxima, tipoVehiculo);

	}

	@Override
	public void imprimir() {

		System.out.println("Vehiculo Aquatico");
		super.imprimir();
		System.out.println("Nueva velocidad actual = " + (this.velocidadMaxima - this.velocidadActual));

	}

	@Override
	public int calcularRevolucionesMotor(int fuerza, int radio) {
		return Motor.super.calcularRevolucionesMotor(fuerza, radio);
	}

	@Override
	public void recomendarVelocidad(int velocidadViento) {
		if (velocidadViento >= 80) {
			System.out.println("Velocidad del viento es muy alta, se recomienda no salir a navegar");
		} else if (velocidadViento <= 10) {
			System.out.println("Velocidad del viento es muy baja, se recomienda no salir a navegar");
		} else {
			System.out.println("Se recomienda salir a navegar");
		}

	}

}
