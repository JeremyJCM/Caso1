import java.util.Scanner;

public class Clase21 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		float g = 0;
		System.out.println("Ingresa el valor de tu gasto");
		g = sc.nextFloat();
		float pg = (g*12)/100;
		float t = g - pg;
		System.out.println("*********************");
		System.out.println("*R E S U L T A D O S*");
		System.out.println("*********************");
		System.out.println("El valor reducido de tu gasto es :" + t );	

	}
		

	}


