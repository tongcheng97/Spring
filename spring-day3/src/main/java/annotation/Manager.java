package annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mg")
public class Manager {
	@Value("#{config.pagesize}")
	private String pagesize;
	@Value("∞◊Û„”Í")
	private String name;

	public Manager() {
		System.out.println("Manager()");
	}

	@Override
	public String toString() {
		return "Manager [pagesize=" + pagesize + ", name=" + name + "]";
	}
	
	
}
