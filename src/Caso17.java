import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat();
		System.out.println("Ingresa el numero de aprobados: ");
		int a = sc.nextInt();
		
		System.out.println("Ingresa el numero de desaprobados: ");
		int d = sc.nextInt();
		
		System.out.println("Ingresa el numero de retirados: ");
		int r = sc.nextInt();
		System.out.println("*********************");
		System.out.println("*R E S U L T A D O S*");
		System.out.println("*********************");
		
		float pa = (float)((a * 100) / (a + d + r));
		System.out.println("Aprbados: " + pa + "%");
		
		float pd = (float)((d * 100) / (a + d + r));
		System.out.println("Desaprovados: " + pd + "%");
		
		float pr = (float)((r * 100) / (a + d + r));
		System.out.println("Aprbados: " + pr +"%");
		
	}

}
