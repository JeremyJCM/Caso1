import java.text.DecimalFormat;
import java.util.Scanner;

	public class Caso15 {
		 public static void main(String[] args){
		 
		   Scanner sc = new Scanner(System.in);
		   DecimalFormat df = new DecimalFormat();
		   
		   System.out.println("Cantidad: ");
		   float cantidad = sc.nextFloat();
		   
		   System.out.println("Precio ");
		   float precio = sc.nextFloat();
		    
		    float importe1 = cantidad * precio;
		    float importe2 = (float) (importe1 / 3.24); 
		    float importe3 = (float) (importe1 / 3.75); 
		    System.out.println("*********************");
			System.out.println("*R E S U L T A D O S*");
			System.out.println("*********************");
		    System.out.println("Importe en S/ ........: " + df.format(importe1));
		    System.out.println("Importe en U$/ ........: " + df.format(importe2));
		    System.out.println("Importe en € ........: " + df.format(importe3));
  }
		
		

}


