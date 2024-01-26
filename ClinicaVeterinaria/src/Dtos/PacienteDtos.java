/**
 * 
 */
package Dtos;

/**
 * @author nrojlla 190124 
 * Datos del paciente a atender
 */
public class PacienteDtos {
	
	long idPaciente;
	long idEsclavo;
	
	String nombrePaciente = "aaaaa";
	int edadPaciente = 11111;
	String fchNacimientoPaciente = "9999 12 31";
	String especiePaciente = "aaaaa";
	char sexoBiologicoPaciente = 'a';

	
	//TO STRING
	@Override
	public String toString() {
		return "PacienteDtos [idPaciente=" + idPaciente + ", idEsclavo=" + idEsclavo + ", nombrePaciente="
				+ nombrePaciente + ", edadPaciente=" + edadPaciente + ", fchNacimientoPaciente=" + fchNacimientoPaciente
				+ ", especiePaciente=" + especiePaciente + ", sexoBiologicoPaciente=" + sexoBiologicoPaciente + "]";
	}
	
	//CONSTRUCTORES
	public PacienteDtos() {
		super();
	}

	public PacienteDtos(long idPaciente, long idEsclavo, String nombrePaciente, int edadPaciente,
			String fchNacimientoPaciente, String especiePaciente, char sexoBiologicoPaciente) {
		super();
		this.idPaciente = idPaciente;
		this.idEsclavo = idEsclavo;
		this.nombrePaciente = nombrePaciente;
		this.edadPaciente = edadPaciente;
		this.fchNacimientoPaciente = fchNacimientoPaciente;
		this.especiePaciente = especiePaciente;
		this.sexoBiologicoPaciente = sexoBiologicoPaciente;
	}

	//GETTERS & SETTERS
	public long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(long idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public int getEdadPaciente() {
		return edadPaciente;
	}

	public void setEdadPaciente(int edadPaciente) {
		this.edadPaciente = edadPaciente;
	}

	public String getFchNacimientoPaciente() {
		return fchNacimientoPaciente;
	}

	public void setFchNacimientoPaciente(String fchNacimientoPaciente) {
		this.fchNacimientoPaciente = fchNacimientoPaciente;
	}

	public String getEspeciePaciente() {
		return especiePaciente;
	}

	public void setEspeciePaciente(String especiePaciente) {
		this.especiePaciente = especiePaciente;
	}

	public char getSexoBiologicoPaciente() {
		return sexoBiologicoPaciente;
	}

	public void setSexoBiologicoPaciente(char sexoBiologicoPaciente) {
		this.sexoBiologicoPaciente = sexoBiologicoPaciente;
	}

	public long getIdEsclavo() {
		return idEsclavo;
	}

	public void setIdEsclavo(long idEsclavo) {
		this.idEsclavo = idEsclavo;
	}

	
	
}
