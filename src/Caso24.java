import java.util.Scanner;
public class Caso24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa el monto 1: ");
		float m1 = sc.nextInt();
		
		System.out.println("Ingresa el monto 2: ");
		float m2 = sc.nextInt();
		
		System.out.println("Ingresa el monto 3: ");
		float m3 = sc.nextInt();
		
		float r1 = (m1/5) + ((m2 * 20) /100);
		float r2 = (m3+((m3*60)/100))/2;
		float r3 = m1 + m2 + m3 -(((m1 + m2 + m3)* 8) / 100);
		
		System.out.println("*********************");
		System.out.println("*R E S U L T A D O S*");
		System.out.println("*********************");
		
		System.out.println("El resltado 1 es: "+ r1);
		System.out.println("El resltado 2 es: "+ r2);
		System.out.println("El resltado 3 es: "+ r3);
	}

}
