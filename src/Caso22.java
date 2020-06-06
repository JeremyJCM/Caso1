import java.util.Scanner;
public class Caso22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = "";
		System.out.println("Ingresa el nombre del alumno: ");
		name = sc.nextLine();
		int n1 = 0;
		System.out.println("Ingresa la primera nota de " + name + " : ");
		n1 = sc.nextInt();
		
		int n2 = 0;
		System.out.println("Ingresa la segunda nota de " + name + " : ");
		n2 = sc.nextInt();
		
		int n3 = 0;
		System.out.println("Ingresa la tercera nota de " + name + " : ");
		n3 = sc.nextInt();
		
		System.out.println("*********************");
		System.out.println("*R E S U L T A D O S*");
		System.out.println("*********************");
		float p =(float) ((n1*0.2) + (n2*0.3) + (n3*0.5));
		System.out.println("El promedio de " + name + " es: " + p);
		
		
	}

}
