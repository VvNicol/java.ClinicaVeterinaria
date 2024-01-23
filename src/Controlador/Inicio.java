/**
 * 
 */
package Controlador;

import java.util.ArrayList;
import java.util.List;
import Dtos.PacienteDtos;
import Dtos.EsclavoDto;
import Servicios.MenuImplementacion;
import Servicios.MenuInterface;
import Servicios.OperativaImplementacion;
import Servicios.OperativaInterface;


/**
 * Aplicacion principal de aplicacion para pacientes
 * @author csi23-nrojlla 1900124
 */
public class Inicio {

	/**
	 * Funciones de la aplicacion
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<PacienteDtos> listaPaciente = new ArrayList<PacienteDtos>();
		List<EsclavoDto> esclavoLista = new ArrayList<EsclavoDto>();
		
			/*ArrayList<PacienteDtos> arrayListPaciente = new ArrayList<PacienteDtos>();
				PacienteDtos[] arrayPaciente = new PacienteDtos[100];
				PacienteDtos paciente1 = new PacienteDtos();
				System.out.println(paciente1.toString());
				paciente1.setNombrePaciente("Chango");
				System.out.println(paciente1.getNombrePaciente());*/
		
		MenuInterface mi = new MenuImplementacion();
		OperativaInterface oi = new OperativaImplementacion();
		
		Boolean isCerrado = false;
		int opcionSeleccionada; 
		
		
		do {
		
		opcionSeleccionada = mi.MenuMostrar();
		
			switch(opcionSeleccionada) 
			{  
				case 0:
				isCerrado = true;
				System.out.println("El menu esta cerrado");
					break;
				case 1:
					System.out.println("###############");	
					oi.paciente(listaPaciente);
					//oi.esclavo(esclavoLista);
					for (PacienteDtos paci : listaPaciente) {
						System.out.println(paci);
					}
					break;
				
				default: System.out.println("la opcion no existe");
			}
				
			
		}while(!isCerrado);
		
	}		
}