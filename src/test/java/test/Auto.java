package test;

public class Auto {
	String modelo;
	int precio;
	Asiento [] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int cantidad = 0;
		for (int x=0;x<asientos.length; x++) {
			if(asientos[x].getClass()==Asiento.class) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
	String verificarIntegridad() {
		String verificado = "Las piezas no son originales";
		boolean aux= true;
		for (int x=0;x<asientos.length; x++) {
			if(asientos[x].registro!=registro) {
				aux = false;}
		}
		if(registro==motor.registro & aux) {
			verificado = "Auto original";
		}
		return verificado;
	}
}
