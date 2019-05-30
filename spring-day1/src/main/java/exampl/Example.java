package exampl;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example {

	public static void main(String[] args) {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("exampl.xml");
		ExampleBean eb1 = ac.getBean("eb1",ExampleBean.class);
		ac.close();
	}

}
