package annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("ls")
public class LoginService {
	@Resource(name="ad")
	private AdminDAO ad;

	public LoginService() {
		System.out.println("LoginService()");
	}

	@Override
	public String toString() {
		return "LoginService [ad=" + ad + "]";
	}
	
}
