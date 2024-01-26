/**
 * 
 */
package Servicios;
import java.util.Scanner;

/**
 * @param 
 * 
 */
public class MenuImplementacion implements MenuInterface {

	@Override
	public int MenuMostrar() {
		
		Scanner sc = new Scanner(System.in);
		
		int OpcionAElegir;
		
		System.out.println("################");
		System.out.println("CLINICA VETERINARIA");
		System.out.println("0.Cerrar aplicacion ");
		System.out.println("1.Añadir nuevo paciente ");
		System.out.println("#####################");
		
		OpcionAElegir = sc.nextInt();
		
		return OpcionAElegir;
		
	}

}
