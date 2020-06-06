import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		System.out.println("Ingresa el lado a del triangulo ");
		a = sc.nextInt();
		int b = 0;
		System.out.println("Ingresa el lado b del triangulo: ");
		b = sc.nextInt();
		int c = 0;
		System.out.println("Ingresa el lado c del triangulo: ");
		c = sc.nextInt();
		
		int P= a + b +c;
		
		
		System.out.println("*********************");
		System.out.println("*R E S U L T A D O S*");
		System.out.println("*********************");
		
		System.out.println("El perimetro es: "+ P);
		;
		
		

	}

}
