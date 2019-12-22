package cl.misko.sb.bean;

/**
 * cuerpo de las salidas
 * 
 * @author camilongo
 *
 */
public class BodyResponse {

	public BodyResponse(String codigo, String mensaje) {
		super();
		this.codigo = codigo;
		this.mensaje = mensaje;
	}

	private String codigo;
	private String mensaje;

	/** GET Y SET **/
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
