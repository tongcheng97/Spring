package ioc2;

public class LoginService {
	private DB d;
	
	public LoginService(DB d) {
		System.out.println("LoginService(DB)");
		this.d = d;
	}

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
