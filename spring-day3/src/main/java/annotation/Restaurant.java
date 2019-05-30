package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("rt")
public class Restaurant {
	
	@Autowired
	@Qualifier("wt")
	private Waiter wt;
	
	public Restaurant() {
		System.out.println("Restaurant()");
	}
	
	@Override
	public String toString() {
		return "Restaurant [wt=" + wt + "]";
	}

}
