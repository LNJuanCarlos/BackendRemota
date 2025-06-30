package prueba.remota.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ordenes_de_trabajo")
public class OrdenDeTrabajo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_ot", length = 10)
    private String idOt;

    @Column(name = "comentario")
    private String comentario;

    // Getters y Setters
    public String getIdOt() {
        return idOt;
    }

    public void setIdOt(String idOt) {
        this.idOt = idOt;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}