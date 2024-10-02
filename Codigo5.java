/* Implementa un programa que indique si un numero es AFORTUNADO o NO AFORTUNADO
 * se considera un numero afortunado si al ser dividido por 10 tiene residuo de 3, 7, 8 o 9
 * Una vez que se determina si el numero es afortunado o no se debe de dividir entre 10 y volver a evaluar
 * hasta que n1 sea < 0
 * */
import java.util.Scanner; //importamos la libreria

public class Codigo5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // Añadimos el System.in
		System.out.print("Introduzca un número: "); // Cambiamos la comilla ' por "
		// String ni = s.nextLine(); Cambiamos esta linea para que el numero que se escriba por consola
		// sea un entero
		int ni = s.nextInt();
		int c = ni; 

		int afo = 0;
		int noAfo = 0;

		while (ni > 0) 
		{
			int digito = (int) (ni % 10);
			if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
				ni /= 10; // Agregamos esta operacion para que ni vaya disminuyendo y no se cicle
			} else {
				noAfo++;
				ni /= 10;
			}
			
			if (afo > noAfo) {
				System.out.println("El " + c + " es un número afortunado."); //agregamos la t en la palabra prinln
			} else {
				System.out.println("El " + c + " no es un número afortunado.");
			}
			
			c=ni; //Hacemos la asignacion a c con el valor de ni para que haga la evaluacion nuevamente
		} // while
		s.close(); //Cerramos el scanner
	}
}