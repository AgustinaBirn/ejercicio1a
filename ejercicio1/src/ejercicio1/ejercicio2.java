package ejercicio1;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche coche = new Coche(); 
	coche.sumarPuerta();
	System.out.println(coche.puertas);
	}
}
	class Coche {
		public int puertas = 3;
		public void sumarPuerta() {
			this.puertas++;
		}
	}



	