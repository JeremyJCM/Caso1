import java.util.Scanner;

public class Caso23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = "";
		System.out.println("Ingresa el nombre del producto: ");
		name = sc.nextLine();
		
		float p = 0;
		System.out.println("Ingresa el precio del/la " + name + " : ");
		p = sc.nextFloat();
		
		int c = 0;
		System.out.println("Ingresa la la cantidad del/la " + name + " : ");
		c = sc.nextInt();
		
		float i = p* c;
		float igv = (i*18)/100;
		float d = (i*3)/100;
		float t= (i - d) + igv;
		System.out.println("*********************");
		System.out.println("*R E S U L T A D O S*");
		System.out.println("*********************");
		System.out.println("El importe es: " + i );
		System.out.println("El igv es  " + igv );
		System.out.println("El descuento es: " + d );
		System.out.println("El total es: " + t );
		
		
	}

}
