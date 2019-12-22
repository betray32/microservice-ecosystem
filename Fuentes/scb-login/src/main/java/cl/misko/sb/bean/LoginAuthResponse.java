package cl.misko.sb.bean;

/**
 * Pojo para el cliente
 * 
 * @author ccontrerasc
 *
 */
public class LoginAuthResponse {

	private HeadResponse head;
	private BodyResponse body;

	/** GET Y SET **/
	public HeadResponse getHead() {
		return head;
	}

	public void setHead(HeadResponse head) {
		this.head = head;
	}

	public BodyResponse getBody() {
		return body;
	}

	public void setBody(BodyResponse body) {
		this.body = body;
	}

}
