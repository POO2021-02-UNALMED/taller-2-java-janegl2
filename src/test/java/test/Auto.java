package test;

public class Auto {
	String modelo;
	int precio;
	Asiento asientos[];
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int cantidad = 0;
		for (int x=0;x<asientos.length; x++) {
			if(asientos[x] instanceof Asiento) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
	 String verificarIntegridad() {
		 if (motor.registro != registro) {
			 return "Las piezas no son originales";
		 }
		 for (int x=0; x<asientos.length; x++) {
			 if (asientos[x] instanceof Asiento) {
				 if (asientos[x].registro != registro) {
					 return "Las piezas no son originales";}
				 }
		 	}
		 return "Auto original";}
}
