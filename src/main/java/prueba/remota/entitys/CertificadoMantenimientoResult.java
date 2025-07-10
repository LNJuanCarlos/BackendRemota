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
@SqlResultSetMapping(
    name = "CertificadoMantenimientoMapping",
    classes = @ConstructorResult(
        targetClass = prueba.remota.dto.CertificadoMantenimientoDto.class,
        columns = {
            @ColumnResult(name = "CompaniaSocio", type = String.class),
            @ColumnResult(name = "numeroDoc", type = Integer.class),
            @ColumnResult(name = "fecha", type = String.class),
            @ColumnResult(name = "ordenTrabajo", type = String.class),
            @ColumnResult(name = "maquinaCodigo", type = String.class),
            @ColumnResult(name = "maquinaHoraKilometraje", type = String.class),
            @ColumnResult(name = "maquinaKilometraje", type = Integer.class),
            @ColumnResult(name = "modelo", type = String.class),
            @ColumnResult(name = "numeroPlaca", type = String.class),
            @ColumnResult(name = "descripcionMarca", type = String.class),
            @ColumnResult(name = "descripcionColor", type = String.class),
            @ColumnResult(name = "nombreCompleto", type = String.class),
            @ColumnResult(name = "nombreEmpresa", type = String.class),
            @ColumnResult(name = "numeroMotor", type = String.class)
        }
    )
)
@NamedStoredProcedureQuery(
    name = "CertificadoMantenimiento.obtenerCertificado",
    procedureName = "sp_cr_listacab_web",
    resultSetMappings = "CertificadoMantenimientoMapping",
    parameters = {
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "CompaniaSocio", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "numerodoc", type = Integer.class)
    }
)
public class CertificadoMantenimientoResult {
    @Id
    private Long id; // Campo ficticio para que sea @Entity
}