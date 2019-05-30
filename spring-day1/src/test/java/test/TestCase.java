package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ioc.A;
import ioc.LoginService;
import scope.MessageBean;
import scope.ScopeBean;


public class TestCase {

	//测试作用域
	public void test1() {
		//启动spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("scope.xml");
		//获得对象
		ScopeBean s1 = ac.getBean("s1",ScopeBean.class);
		ScopeBean s2 = ac.getBean("s1",ScopeBean.class);
		System.out.println(s1);
		System.out.println(s1);
	}
	
	@Test
	//测试生命周期
	public void test2() {
		//启动spring容器
		//ApplicationContext：接口
		//AbstractApplicationContext：子接口
		//ClassPathXmlApplicationContext：实现上述接口的具体类
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("scope.xml");
		//获得对象
		MessageBean mb1 = ac.getBean("mb1",MessageBean.class);
		mb1.sendMsg();
		//关闭容器
		ac.close();
	}
	
	@Test
	//测试延迟加载
	public void test3() {
		//启动spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("scope.xml");
		
	}
	
	@Test
	//测试set方式的注入
	public void test4() {
		//启动spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc.xml");
		//获得对象
		A a1 = ac.getBean("a1",A.class);
		a1.execute();
	}
	
	@Test
	//练习set方式的注入
	public void test5() {
		//启动spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc.xml");
		//获得对象
		LoginService ls1 = ac.getBean("ls1",LoginService.class);
		ls1.print();
	}
	
	
}
