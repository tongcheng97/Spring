package ioc;

public class LoginService {
	private DB d;
	
	public void setDse(DB d) {
		System.out.println("setD()");
		this.d = d;
	}

	public LoginService() {
		System.out.println("LoginService()");
	}
	
	public void print() {
		System.out.println("print()");
		d.tongc();
	}

}
