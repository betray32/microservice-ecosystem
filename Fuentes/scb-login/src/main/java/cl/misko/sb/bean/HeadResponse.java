package cl.misko.sb.bean;

/**
 * Cabecera de salida
 * 
 * @author camilongo
 *
 */
public class HeadResponse {

	public HeadResponse(String code, String msj) {
		super();
		this.code = code;
		this.msj = msj;
	}

	private String code;
	private String msj;

	/** GET Y SET **/
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsj() {
		return msj;
	}

	public void setMsj(String msj) {
		this.msj = msj;
	}

}
