import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0;
		float n2 = 0;
		System.out.println("Dime un numero decimal: ");
		n1 = sc.nextFloat();
		System.out.println("Dime un otro numero decimal");
		n2 = sc.nextFloat();
		
		float s= n1 + n2;
		float r= n1-n2;
		float m=n1*n2;
		float d=n1/n2;
		float re=n1%n2;
		System.out.println("*********************");
		System.out.println("*R E S U L T A D O S*");
		System.out.println("*********************");
		System.out.println("La Suma de tus 2 numero es: " + s );
		System.out.println("La Resta de tus 2 numero es: " + r );
		System.out.println("El producto de tus 2 numero es: " + m );
		System.out.println("La divicion de tus 2 numero es: " + d );
		System.out.println("El resto entero de tus 2 numero es: " + re );

	}

}
