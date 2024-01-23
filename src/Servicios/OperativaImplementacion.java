/**
 * 
 */
package Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dtos.EsclavoDto;
import Dtos.PacienteDtos;

/**
 * 
 */
public class OperativaImplementacion implements OperativaInterface {
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void paciente(List<PacienteDtos> listaPaciente) {
		
		listaPaciente.add(agregarNuevoPaciente(listaPaciente));
		
	}
	
	private PacienteDtos agregarNuevoPaciente (List<PacienteDtos> listaPaciente){
		
		PacienteDtos NuevoPaciente = new PacienteDtos();
		
		System.out.println("Ingrese ID:  ");
		NuevoPaciente.setIdPaciente( sc.nextLong() );
		
		sc.nextLine();
		
		System.out.println("Ingrese nombre:  ");
		NuevoPaciente.setNombrePaciente(sc.nextLine())  ;
		
		System.out.println("Ingrese edad:  ");
		NuevoPaciente.setEdadPaciente(sc.nextInt());
		
		sc.nextLine();
		
		System.out.println("Cumpleaños (formato AAAA/MM/DD):  ");
		NuevoPaciente.setFchNacimientoPaciente(sc.nextLine());
		
		System.out.println("Especie :  ");
		NuevoPaciente.setEspeciePaciente(sc.nextLine());
		
		System.out.println("Sexo:  ");
		NuevoPaciente.setSexoBiologicoPaciente(sc.next().charAt(0));
		//TODO AGREGAR opcion de verificar si el esclavo existe en un nuevo  metodo 
		
		System.out.println("Ingrese ID del esclavo ");
		long idEsclavo = sc.nextLong();
		NuevoPaciente.setIdEsclavo(idEsclavo);
		
		
		
		verificarEsclavo(idEsclavo, listaPaciente);
		
		return NuevoPaciente;	
	}

	@Override
	public void esclavo(List<EsclavoDto> esclavoLista) {
		
		esclavoLista.add(agregarEsclavo(esclavoLista));	
	}
	
	private EsclavoDto agregarEsclavo(List<EsclavoDto> esclavoLista) {
		
		EsclavoDto NuevoEsclavo = new EsclavoDto();
		
		System.out.println("Ingrese ID:  ");
		NuevoEsclavo.setIdEsclavo( sc.nextLong() );
		sc.nextLine();
		System.out.println("Ingrese nombre:  ");
		NuevoEsclavo.setNombreEsclavo( sc.nextLine());
		System.out.println("Ingrese apellidos:  ");
		NuevoEsclavo.setApellidosEsclavo( sc.nextLine() );
		System.out.println("Ingrese DNI:  ");
		NuevoEsclavo.setDniEsclavo( sc.nextLine() );
		System.out.println("Ingrese telefono:  ");
		NuevoEsclavo.setTlfEsclavo( sc.nextLine() );
		
		return NuevoEsclavo;	
	}
	
	private void verificarEsclavo(long idEsclavo, List<PacienteDtos> listaPaciente) {
		
		boolean esclavoEncontrado = false;

	    for (PacienteDtos pacienteV : listaPaciente) {
	        if (pacienteV.getIdEsclavo() == idEsclavo) {
	            esclavoEncontrado = true;
	            System.out.println("Esclavo verificado");
	            break;
	        }
	    }

	    if (!esclavoEncontrado) {
	        System.out.println("No existe");
	        System.out.println("Cree un nuevo esclavo");
	        
	        List<EsclavoDto> esclavoLista = new ArrayList<>();
			esclavo(esclavoLista);
	    }
		
	}	
}
