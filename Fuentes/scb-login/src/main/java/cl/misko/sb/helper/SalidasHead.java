package cl.misko.sb.helper;

import cl.misko.sb.bean.HeadResponse;

/**
 * Salidas de cabeza
 * 
 * @author camilongo
 *
 */
public class SalidasHead {

	/**
	 * ok
	 * 
	 * @return
	 */
	public static HeadResponse ok() {
		return new HeadResponse("200", "ok");
	}

	/**
	 * Error
	 * 
	 * @return
	 */
	public static HeadResponse error() {
		return new HeadResponse("500", null);
	}

}
