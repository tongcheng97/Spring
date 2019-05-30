package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import annotation.Bar;
import annotation.LoginService;
import annotation.Manager;
import annotation.Restaurant;
import annotation.School;

public class TestCase {
	@Test
	//测试@Autowired（set方式注入）
	public void test1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
		Restaurant rt = ac.getBean("rt",Restaurant.class);
		System.out.println(rt);
	}
	
	@Test
	//测试@Autowired（构造器方式注入）
	public void test2() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
		School sc = ac.getBean("school",School.class);
		System.out.println(sc);
	}
	
	@Test
	//测试@Resource
	public void test3() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
		Bar bar = ac.getBean("bar",Bar.class);
		System.out.println(bar);
	}
	
	@Test
	//测试@Value
	public void test4() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
		Manager mg = ac.getBean("mg",Manager.class);
		System.out.println(mg);
	}
	
	
	@Test
	//练习
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
		LoginService ls = ac.getBean("ls",LoginService.class);
		System.out.println(ls);
	}
}
