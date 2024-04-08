package vehiculos;

public class Vehiculos {

	public static void main(String[] args) {

		Terrestre terrestre = new Terrestre(60, 180, "Motocicleta");

		terrestre.calcularRevolucionesMotor(1000, 50);
		
		terrestre.imprimir();
		
		terrestre.acelerar();
		
		terrestre.frenar();
		
		Acuatico acuatico = new Acuatico (50, 200, "Carguero");
		
		acuatico.imprimir();
		
		System.out.println("Revoluciones del motor: " + acuatico.calcularRevolucionesMotor(1000, 50));
		
		acuatico.recomendarVelocidad(40);
		
	}

}
