import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0;
		float n2 = 0;
		System.out.println("Dime un numero decimal: ");
		n1 = sc.nextFloat();
		System.out.println("Dime un otro numero decimal");
		n2 = sc.nextFloat();
		
		float p=(n1+n2)/2;
		float n1a =(float)(n1 + (n1 * 0.2 ));
		float n2a = (float)(n2 - (n2*0.3 ));
		System.out.println("*********************");
		System.out.println("*R E S U L T A D O S*");
		System.out.println("*********************");
		System.out.println("El pomedio de los 2 numeros es: " + p);
		System.out.println("El primer numero aumentado en 20% es: " + n1a);
		System.out.println("El segundo numero reducido en 30% es: " + n2a);
	
	
	
	}

}
