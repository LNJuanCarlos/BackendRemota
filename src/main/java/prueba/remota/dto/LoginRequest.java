package prueba.remota.dto;

public class LoginRequest {
	
	private String usuario;   // Documento (RUC)
    private String password;  // Clave
    
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

    

}
