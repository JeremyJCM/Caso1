import java.util.Scanner;
public class Caso11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name ="";
		System.out.println("Ingresa el nombre: ");
		name = sc.nextLine();
		int c= name.length();
		System.out.println("*********************");
		System.out.println("*R E S U L T A D O S*");
		System.out.println("*********************");
		System.out.println("La cantidad de caracteres del nombre " + "'" + name +"'" + " es: " + c);
		
		

	}

}
