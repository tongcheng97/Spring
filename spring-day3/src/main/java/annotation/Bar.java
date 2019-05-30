package annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("bar")
public class Bar {
	
	@Resource(name="wt")
	private Waiter wt;

	public Bar() {
		System.out.println("Bar()");
	}

	@Override
	public String toString() {
		return "Bar [wt=" + wt + "]";
	}

}
