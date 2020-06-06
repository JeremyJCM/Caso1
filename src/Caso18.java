import java.util.Scanner;

public class Caso18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int b = 0;
		System.out.println("Ingresa la base del triangulo: ");
		b = sc.nextInt();
		int a = 0;
		System.out.println("Ingresa la base del triangulo: ");
		a = sc.nextInt();
		
		int A=(b*a)/2;
		
		
		
		System.out.println("*********************");
		System.out.println("*R E S U L T A D O S*");
		System.out.println("*********************");
		
		System.out.println("El area es: "+ A );
		

	}

}
