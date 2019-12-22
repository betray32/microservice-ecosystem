package cl.misko.sb.rest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import cl.misko.sb.bean.LoginAuthResponse;
import cl.misko.sb.bean.LoginInputPost;
import cl.misko.sb.delegate.LoginDelegate;

/**
 * Clase que contiene ejemplos de como exponer endpoints rest
 * 
 * @author ccontrerasc
 *
 */
@RestController
public class LoginRestExposer {

	/**
	 * LOG
	 */
	private static final Log log = LogFactory.getLog(LoginRestExposer.class);

	@Autowired
	private LoginDelegate delegate;

	/**
	 * Validar que el servicio este corriendo
	 * 
	 * @return
	 */
	@GetMapping(value = "/")
	public String echoLoginService() {
		log.info("--------------------------");
		log.info("Solicitud > SCB LOGIN [OK]");
		return "SCB - LOGIN OK!";
	}

	/**
	 * Ejemplo de endpoint con metodo POST
	 * 
	 * @param input
	 * @return
	 */
	@PostMapping(value = "autenticar")
	@ResponseBody
	public LoginAuthResponse loginCliente(@RequestBody LoginInputPost input) {

		log.info("------------------------------------------------------------");
		log.info("Se ha iniciado una solicitud hacia el metodo [loginCliente]");
		log.info("[REQUEST] = " + new Gson().toJson(input));

		LoginAuthResponse salida = delegate.login(input);

		log.info("Se ha finalizado una solicitud hacia el metodo [loginCliente]");
		log.info("------------------------------------------------------------");

		return salida;

	}

}
