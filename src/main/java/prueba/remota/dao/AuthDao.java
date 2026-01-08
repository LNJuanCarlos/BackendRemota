package prueba.remota.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import prueba.remota.entitys.PF_UsuariosExtranet;

@Repository
public interface AuthDao extends CrudRepository<PF_UsuariosExtranet, Integer> {

	@Query(
			  value = "SELECT " +
			          "u.persona, " +
			          "u.Clave, " +
			          "u.Ultimafechamodif " +
			          "FROM PF_UsuariosExtranet u " +
			          "INNER JOIN PersonaMast p ON p.Persona = u.persona " +
			          "WHERE p.Documento = :usuario " +
			          "AND u.Clave = :password",
			  nativeQuery = true
			)
			PF_UsuariosExtranet login(
			    @Param("usuario") String usuario,
			    @Param("password") String password
			);
	
	@Modifying
	@Transactional
	@Query(
	    value = "UPDATE u " +
	            "SET u.Clave = :nuevaClave, u.UltimaFechaModif = GETDATE() " +
	            "FROM PF_UsuariosExtranet u " +
	            "INNER JOIN PersonaMast p ON p.Persona = u.persona " +
	            "WHERE p.Documento = :documento " +
	            "AND u.Clave = :claveActual",
	    nativeQuery = true
	)
	int actualizarClave(
	    @Param("documento") String documento,
	    @Param("claveActual") String claveActual,
	    @Param("nuevaClave") String nuevaClave
	);
}
