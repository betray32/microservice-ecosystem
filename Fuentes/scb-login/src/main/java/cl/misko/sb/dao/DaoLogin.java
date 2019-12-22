package cl.misko.sb.dao;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import cl.misko.sb.delegate.LoginDelegate;

/**
 * Dao para el login
 * 
 * @author camilongo
 *
 */
@Repository
public class DaoLogin {

	/**
	 * LOG
	 */
	private static final Log log = LogFactory.getLog(LoginDelegate.class);

	/**
	 * Maneja las conexiones a bases de datos
	 */
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Permite autenciar el usuario
	 * 
	 * @param user
	 * @param pass
	 * @return
	 */
	public int autenticar(String user, String pass) {

		try {

			log.info("Executando AUTH...");
			StoredProcedureQuery storedProcedureQuery = entityManager

					// Definicion
					.createStoredProcedureQuery("login_auth")

					// def
					.registerStoredProcedureParameter(1, String.class, ParameterMode.IN)
					.registerStoredProcedureParameter(2, String.class, ParameterMode.IN)
					.registerStoredProcedureParameter(3, Integer.class, ParameterMode.OUT)
					.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT)
					.registerStoredProcedureParameter(5, Integer.class, ParameterMode.OUT)

					// params
					.setParameter(1, user).setParameter(2, pass);

			log.info("Exec...");
			storedProcedureQuery.execute();
			log.info("ok");

			Integer salida = (Integer) storedProcedureQuery.getOutputParameterValue(3);
			log.info("Salida: " + salida);

			return salida;

		} catch (Exception e) {
			log.error("Error en login, Detalle > ", e);
		}

		return -1;
	}

}
