package prueba.remota.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import prueba.remota.entitys.PF_UsuariosExtranet;

@Repository
public interface AuthDao extends CrudRepository<PF_UsuariosExtranet, Integer> {

	@Query(
		    value = "SELECT u.* " +
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
}
