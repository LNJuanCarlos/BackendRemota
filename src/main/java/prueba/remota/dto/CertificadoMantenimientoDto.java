package prueba.remota.dto;

public class CertificadoMantenimientoDto {

	        private String companiaSocio;
	        private int numeroDoc;
	        private String fecha;
	        private String ordenTrabajo;
	        private String maquinaCodigo;
	        private String maquinaHoraKilometraje;
	        private int maquinaKilometraje;
	        private String modelo;
	        private String numeroPlaca;
	        private String descripcionMarca;
	        private String descripcionColor;
	        private String nombreCompleto;
	        private String nombreEmpresa;
	        private String numeroMotor;
	        
			public CertificadoMantenimientoDto(String companiaSocio, int numeroDoc, String fecha, String ordenTrabajo,
					String maquinaCodigo, String maquinaHoraKilometraje, int maquinaKilometraje, String modelo,
					String numeroPlaca, String descripcionMarca, String descripcionColor, String nombreCompleto,
					String nombreEmpresa, String numeroMotor) {
				
				this.companiaSocio = companiaSocio;
				this.numeroDoc = numeroDoc;
				this.fecha = fecha;
				this.ordenTrabajo = ordenTrabajo;
				this.maquinaCodigo = maquinaCodigo;
				this.maquinaHoraKilometraje = maquinaHoraKilometraje;
				this.maquinaKilometraje = maquinaKilometraje;
				this.modelo = modelo;
				this.numeroPlaca = numeroPlaca;
				this.descripcionMarca = descripcionMarca;
				this.descripcionColor = descripcionColor;
				this.nombreCompleto = nombreCompleto;
				this.nombreEmpresa = nombreEmpresa;
				this.numeroMotor = numeroMotor;
			}

			public String getcompaniaSocio() {
				return companiaSocio;
			}

			public void setcompaniaSocio(String companiaSocio) {
				this.companiaSocio = companiaSocio;
			}

			public int getNumeroDoc() {
				return numeroDoc;
			}

			public void setNumeroDoc(int numeroDoc) {
				this.numeroDoc = numeroDoc;
			}

			public String getFecha() {
				return fecha;
			}

			public void setFecha(String fecha) {
				this.fecha = fecha;
			}

			public String getOrdenTrabajo() {
				return ordenTrabajo;
			}

			public void setOrdenTrabajo(String ordenTrabajo) {
				this.ordenTrabajo = ordenTrabajo;
			}

			public String getMaquinaCodigo() {
				return maquinaCodigo;
			}

			public void setMaquinaCodigo(String maquinaCodigo) {
				this.maquinaCodigo = maquinaCodigo;
			}

			public String getMaquinaHoraKilometraje() {
				return maquinaHoraKilometraje;
			}

			public void setMaquinaHoraKilometraje(String maquinaHoraKilometraje) {
				this.maquinaHoraKilometraje = maquinaHoraKilometraje;
			}

			public int getMaquinaKilometraje() {
				return maquinaKilometraje;
			}

			public void setMaquinaKilometraje(int maquinaKilometraje) {
				this.maquinaKilometraje = maquinaKilometraje;
			}

			public String getModelo() {
				return modelo;
			}

			public void setModelo(String modelo) {
				this.modelo = modelo;
			}

			public String getNumeroPlaca() {
				return numeroPlaca;
			}

			public void setNumeroPlaca(String numeroPlaca) {
				this.numeroPlaca = numeroPlaca;
			}

			public String getDescripcionMarca() {
				return descripcionMarca;
			}

			public void setDescripcionMarca(String descripcionMarca) {
				this.descripcionMarca = descripcionMarca;
			}

			public String getDescripcionColor() {
				return descripcionColor;
			}

			public void setDescripcionColor(String descripcionColor) {
				this.descripcionColor = descripcionColor;
			}

			public String getNombreCompleto() {
				return nombreCompleto;
			}

			public void setNombreCompleto(String nombreCompleto) {
				this.nombreCompleto = nombreCompleto;
			}

			public String getNombreEmpresa() {
				return nombreEmpresa;
			}

			public void setNombreEmpresa(String nombreEmpresa) {
				this.nombreEmpresa = nombreEmpresa;
			}

			public String getNumeroMotor() {
				return numeroMotor;
			}

			public void setNumeroMotor(String numeroMotor) {
				this.numeroMotor = numeroMotor;
			}  
      

}
