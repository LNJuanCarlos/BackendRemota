package prueba.remota.entitys;


import javax.persistence.SqlResultSetMapping;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ColumnResult;

@SqlResultSetMapping(
	    name = "detalleMapping",
	    classes = @ConstructorResult(
	        targetClass = prueba.remota.dto.CertificadoMantenimientoDetalleDto.class,
	        columns = {
	            @ColumnResult(name = "DescripcionActividad", type = String.class)
	        }
	    )
	)
	@Entity
	public class CertificadoMantenimientoDetalleMapping {
	    @Id
	    private Long id;
	}
