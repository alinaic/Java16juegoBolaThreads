public class PrincipalPruebas {

	public static void main(String[] args) {

		// cuando creemos una istancia usando new
		// debemos indicar el constructor a usar

		Bola b = new Bola(40, 50);

		// muchas veces necesitamos que los valor que
		// tengan un objeto que no se puedan modificar desde fuera de su clase
		// para que tengamos un control total sobre los mismos
		// En este caso, puedo dar una x e y inicial a una bola,
		// pero luego no puedo modificarlas de repente
		// b.x = 50 //esto daria error

		// lo siguiente sacaría el valor del return
		// que hace el metodo obtenerX
		System.out.println("La bola esta eb la posicion x: " + b.getX() + " y: " + b.getY());

	}
}
