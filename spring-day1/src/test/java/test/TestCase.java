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

	//����������
	public void test1() {
		//����spring����
		ApplicationContext ac = new ClassPathXmlApplicationContext("scope.xml");
		//��ö���
		ScopeBean s1 = ac.getBean("s1",ScopeBean.class);
		ScopeBean s2 = ac.getBean("s1",ScopeBean.class);
		System.out.println(s1);
		System.out.println(s1);
	}
	
	@Test
	//������������
	public void test2() {
		//����spring����
		//ApplicationContext���ӿ�
		//AbstractApplicationContext���ӽӿ�
		//ClassPathXmlApplicationContext��ʵ�������ӿڵľ�����
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("scope.xml");
		//��ö���
		MessageBean mb1 = ac.getBean("mb1",MessageBean.class);
		mb1.sendMsg();
		//�ر�����
		ac.close();
	}
	
	@Test
	//�����ӳټ���
	public void test3() {
		//����spring����
		ApplicationContext ac = new ClassPathXmlApplicationContext("scope.xml");
		
	}
	
	@Test
	//����set��ʽ��ע��
	public void test4() {
		//����spring����
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc.xml");
		//��ö���
		A a1 = ac.getBean("a1",A.class);
		a1.execute();
	}
	
	@Test
	//��ϰset��ʽ��ע��
	public void test5() {
		//����spring����
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc.xml");
		//��ö���
		LoginService ls1 = ac.getBean("ls1",LoginService.class);
		ls1.print();
	}
	
	
}
