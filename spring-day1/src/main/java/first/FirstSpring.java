package first;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//启动spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//System.out.println(ac);
		//获得对象
		Student stu = ac.getBean("stu1",Student.class);
		System.out.println(stu);
		Date date = ac.getBean("date1",Date.class);
		System.out.println(date);
		Calendar cal = ac.getBean("cal1",Calendar.class);
		System.out.println(cal);
		Date time = ac.getBean("time1",Date.class);
		System.out.println(time);
	}

}
