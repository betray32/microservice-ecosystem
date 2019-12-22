package cl.misko.sb.bean;

/**
 * Ejemplo de estructura de entrada para un endpoint post
 * 
 * @author ccontrerasc
 *
 */
public class LoginInputPost {

	private String user;
	private String pass;

	/** GET Y SET **/
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "LoginInputPost [user=" + user + ", pass=" + pass + "]";
	}

}
