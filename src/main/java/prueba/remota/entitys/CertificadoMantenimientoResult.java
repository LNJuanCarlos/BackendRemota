package prueba.remota.entitys;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.StoredProcedureParameter;

import prueba.remota.dto.CertificadoMantenimientoDto;

import javax.persistence.ConstructorResult;

import java.util.Date;

import javax.persistence.ColumnResult;

@Entity
@NamedStoredProcedureQuery(
    name = "certificado.obtenerPorOrden",
    procedureName = "nombre_de_tu_procedimiento_sql",
    resultSetMappings = "CertificadoMapping",
    parameters = {
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "ordenTrabajo", type = String.class)
    }
)
@SqlResultSetMapping(
    name = "CertificadoMapping",
    classes = @ConstructorResult(
        targetClass = CertificadoMantenimientoDto.class,
        columns = {
            @ColumnResult(name = "nombreEmpresa", type = String.class),
            @ColumnResult(name = "fecha", type = Date.class),
            @ColumnResult(name = "cliente", type = String.class),
            @ColumnResult(name = "descripcionMarca", type = String.class),
            @ColumnResult(name = "modelo", type = String.class),
            @ColumnResult(name = "color", type = String.class),
            @ColumnResult(name = "numeroPlaca", type = String.class),
            @ColumnResult(name = "maquinaKilometraje", type = Integer.class),
            @ColumnResult(name = "maquinaHoraKilometraje", type = String.class)
        }
    )
)
public class CertificadoMantenimientoResult {
    @Id
    private Long id; // solo para que @Entity compile, no se usa
}