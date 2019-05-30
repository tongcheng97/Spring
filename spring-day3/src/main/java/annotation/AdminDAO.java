package annotation;

import org.springframework.stereotype.Component;

@Component("ad")
public class AdminDAO {

	public AdminDAO() {
		System.out.println("AdminDAO()");
	}
	
	public void print() {
		System.out.println("print()");
	}
	
}
