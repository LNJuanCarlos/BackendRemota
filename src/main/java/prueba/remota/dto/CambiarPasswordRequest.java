package prueba.remota.dto;

public class CambiarPasswordRequest {
       
	private String documento;      // el ID del usuario logeado
    private String claveActual;
    private String nuevaClave;
  

	
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getClaveActual() {
        return claveActual;
    }
    public void setClaveActual(String claveActual) {
        this.claveActual = claveActual;
    }
    public String getNuevaClave() {
        return nuevaClave;
    }
    public void setNuevaClave(String nuevaClave) {
        this.nuevaClave = nuevaClave;
    }
 
}

