import java.util.Scanner;

public class Caso20 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		float v = 0;
		System.out.println("Ingresa el valor de tu venta");
		v = sc.nextFloat();
		float pv = (v*42)/100;
		float t = v + pv;
		System.out.println("*********************");
		System.out.println("*R E S U L T A D O S*");
		System.out.println("*********************");
		System.out.println("El valor aumentado de tu venta es :" + t );	

	}

}
