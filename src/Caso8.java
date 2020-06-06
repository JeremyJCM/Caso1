import java.util.Scanner;
public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int l = 0;
		System.out.println("Ingresa el lado del cuadrado: ");
		l = sc.nextInt();
		
		int a = (int)Math.pow(l,2);
		int p = l + l + l +l;
		System.out.println("*********************");
		System.out.println("*R E S U L T A D O S*");
		System.out.println("*********************");
		System.out.println("El perimetro es: "+ p);
		System.out.println("El area es: "+ a );
		

	}

}
