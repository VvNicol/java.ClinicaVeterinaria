/**
 * 
 */
package Dtos;

/**
 * @author csi23-nrojlla 190124
 * 
 * Datos del esclavo
 */
public class EsclavoDto {
	
	long idEsclavo;
	String nombreEsclavo = "aaaaa";
	String apellidosEsclavo = "aaaaa";
	String dniEsclavo;
	String tlfEsclavo;
	
	//TOSTRING
	
	@Override
	public String toString() {
		return "EsclavoDto [idEsclavo=" + idEsclavo + ", nombreEsclavo=" + nombreEsclavo + ", apellidosEsclavo="
				+ apellidosEsclavo + ", dniEsclavo=" + dniEsclavo + ", tlfEsclavo=" + tlfEsclavo + "]";
	}
	/**
	 * 
	 */
	
	//CONSTRUCTORES
	public EsclavoDto() {
		super();
	}
	public EsclavoDto(long idEsclavo, String nombreEsclavo, String apellidosEsclavo, String dniEsclavo,
			String tlfEsclavo) {
		super();
		this.idEsclavo = idEsclavo;
		this.nombreEsclavo = nombreEsclavo;
		this.apellidosEsclavo = apellidosEsclavo;
		this.dniEsclavo = dniEsclavo;
		this.tlfEsclavo = tlfEsclavo;
	}
	//GETTERS && SETTERS
	public long getIdEsclavo() {
		return idEsclavo;
	}
	public void setIdEsclavo(long idEsclavo) {
		this.idEsclavo = idEsclavo;
	}
	public String getNombreEsclavo() {
		return nombreEsclavo;
	}
	public void setNombreEsclavo(String nombreEsclavo) {
		this.nombreEsclavo = nombreEsclavo;
	}
	public String getApellidosEsclavo() {
		return apellidosEsclavo;
	}
	public void setApellidosEsclavo(String apellidosEsclavo) {
		this.apellidosEsclavo = apellidosEsclavo;
	}
	public String getDniEsclavo() {
		return dniEsclavo;
	}
	public void setDniEsclavo(String dniEsclavo) {
		this.dniEsclavo = dniEsclavo;
	}
	public String getTlfEsclavo() {
		return tlfEsclavo;
	}
	public void setTlfEsclavo(String tlfEsclavo) {
		this.tlfEsclavo = tlfEsclavo;
	}

	
}
