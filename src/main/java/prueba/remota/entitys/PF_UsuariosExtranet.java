package prueba.remota.entitys;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PF_UsuariosExtranet")
public class PF_UsuariosExtranet implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "persona")
    private Long persona;

    @Column(name = "Clave", length = 20)
    private String clave;
    
    @Column(name = "Ultimafechamodif")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimaFechaModif;

	public Long getPersona() {
		return persona;
	}

	public void setPersona(Long persona) {
		this.persona = persona;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
    
	public Date getUltimaFechaModif() {
	    return ultimaFechaModif;
	}

	public void setUltimaFechaModif(Date ultimaFechaModif) {
	    this.ultimaFechaModif = ultimaFechaModif;
	}
    

}
