import java.util.*;

public class Ejercicio3 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int factorial;
		int numero;
		factorial = 1;
		
		System.out.println("Ingrese el numero para calcular su factorial");
		numero = scanner.nextInt();
		
		if (numero<0) {
			System.out.println("No existe factorial de numero negativo");
		} else {
			if (numero == 0) {
				System.out.println("El factorial de " + numero + " es " + factorial);
			} else {
				for (int i = numero; i > 0;i--) {
					factorial = factorial*i;
				}
				System.out.println("El factorial de " + numero + " es " + factorial);
			}
		}
	}
}

