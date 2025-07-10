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
            @ColumnResult(name = "NumeroDoc", type = Integer.class),
            @ColumnResult(name = "Fecha", type = String.class),
            @ColumnResult(name = "OrdenTrabajo", type = String.class),
            @ColumnResult(name = "MaquinaCodigo", type = String.class),
            @ColumnResult(name = "MaquinaHoraKilometraje", type = String.class),
            @ColumnResult(name = "MaquinaKilometraje", type = Integer.class),
            @ColumnResult(name = "Modelo", type = String.class),
            @ColumnResult(name = "NumeroPlaca", type = String.class),
            @ColumnResult(name = "Descripcion", type = String.class),
            @ColumnResult(name = "DescripcionCorta", type = String.class),
            @ColumnResult(name = "NombreCompleto", type = String.class),
            @ColumnResult(name = "description", type = String.class),
            @ColumnResult(name = "NumeroMotor", type = String.class)
        }
    )
)
/*@NamedStoredProcedureQuery(
    name = "CertificadoMantenimiento.obtenerCertificado",
    procedureName = "sp_cr_listacab_web",
    resultSetMappings = "CertificadoMantenimientoMapping",
    parameters = {
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "CompaniaSocio", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "numerodoc", type = Integer.class)
    }
)*/
public class CertificadoMantenimientoResult {
    @Id
    private Long id; // Campo ficticio para que sea @Entity
}