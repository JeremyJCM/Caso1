import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		
		System.out.println("Ingresa las horas trabajadas: ");
		int ht = sc.nextInt();
		
		System.out.println("Ingresa la taifa por hora ");
		float th = sc.nextFloat();
		
		float s = ht * th;
		float b = (float)(s * 0.05);
		
		float t = s + b;
		float td = (float)(t / 3.24);
		
		System.out.println("*********************");
		System.out.println("*R E S U L T A D O S*");
		System.out.println("*********************");
		
		System.out.println("El sueldo es: " + s );
		System.out.println("El bono es: " + b );
		System.out.println("El total es: " + t );
		System.out.println("El total en dolares es: U$/" + df.format(td) );
		

	}

}
