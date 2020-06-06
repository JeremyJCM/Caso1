import java.util.Scanner;
public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float r=0;
		System.out.println("Ingresa el radio del circulo: ");
		r = sc.nextFloat();
		float a= (float)3.1416*(r*r);
		float p = (float) (2*3.1416)*r;
		System.out.println("*********************");
		System.out.println("*R E S U L T A D O S*");
		System.out.println("*********************");
		
		System.out.println("El area del circulo es: " +  a);
		System.out.println("El perimetro del circulo es: " +  p);
		

	}

}
