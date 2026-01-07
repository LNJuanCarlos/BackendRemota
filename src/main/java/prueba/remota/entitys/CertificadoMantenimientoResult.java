package prueba.remota.entitys;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
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
            @ColumnResult(name = "Fecha", type = Date.class),
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

public class CertificadoMantenimientoResult {
    @Id
    private Long id; // Campo ficticio para que sea @Entity
}