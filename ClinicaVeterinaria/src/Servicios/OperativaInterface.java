/**
 * 
 */
package Servicios;

import java.util.List;

import Dtos.EsclavoDto;
import Dtos.PacienteDtos;

/**
 * 
 */
public interface OperativaInterface {

	void paciente(List<PacienteDtos> listaPaciente);

	void esclavo(List<EsclavoDto> esclavoLista);

}
