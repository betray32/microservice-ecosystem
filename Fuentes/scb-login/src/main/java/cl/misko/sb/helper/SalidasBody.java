package cl.misko.sb.helper;

import cl.misko.sb.bean.BodyResponse;

/**
 * Salidas de cuerpo
 * 
 * @author camilongo
 *
 */
public class SalidasBody {

	/**
	 * auth ok
	 * 
	 * @return
	 */
	public static BodyResponse ok() {
		return new BodyResponse("0", "auth_ok");
	}

	/**
	 * Error
	 * 
	 * @return
	 */
	public static BodyResponse error() {
		return new BodyResponse("500", "auth_error");
	}

}
