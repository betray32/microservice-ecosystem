package cl.misko.sb.delegate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.misko.sb.bean.LoginAuthResponse;
import cl.misko.sb.bean.LoginInputPost;
import cl.misko.sb.dao.DaoLogin;
import cl.misko.sb.helper.SalidasBody;
import cl.misko.sb.helper.SalidasHead;

/**
 * 
 * @author ccontrerasc
 *
 */
@Service
public class LoginDelegate {

	/**
	 * LOG
	 */
	private static final Log log = LogFactory.getLog(LoginDelegate.class);

	@Autowired
	private DaoLogin dao;

	/**
	 * Realizar logica de negocio sobre el cliente
	 * 
	 * @param input
	 * @return
	 */
	public LoginAuthResponse login(LoginInputPost input) {

		log.info("Inicializando Delegate");
		LoginAuthResponse salida = new LoginAuthResponse();

		log.info("Autenticando...");
		if (dao.autenticar(input.getUser(), input.getPass()) > 0) {

			log.info("Usuario LOGIN OK");
			salida.setBody(SalidasBody.ok());
			salida.setHead(SalidasHead.ok());

		} else {

			log.info("Autenticacion Fallida");
			salida.setBody(SalidasBody.error());
			salida.setHead(SalidasHead.error());
		}

		log.info("Fin Delegate");
		return salida;

	}

}
