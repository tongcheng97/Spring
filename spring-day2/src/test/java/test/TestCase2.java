package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ioc2.A;
import ioc2.LoginService;
import ioc2.Restaurant;
//import some.SomeBean;
import value.SpelBean;
import value.ValueBean;
import annotation.SomeBean;

public class TestCase2 {
	@Test
	//���Թ�������ʽע��
	public void test1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc2.xml");
		A a1 = ac.getBean("a1",A.class);
		a1.execute();
		
	}
	
	@Test
	public void test2() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc2.xml");
		LoginService ls = ac.getBean("ls1",LoginService.class);
		ls.print();
	}
	
	@Test
	//�����Զ�װ��
	public void test3() {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("ioc2.xml");
		Restaurant rt = ac.getBean("rt1",Restaurant.class);
		System.out .println(rt);
		ac.close();
	}
	
	@Test
	//���� ע��������͵�ֵ
	public void test4() {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("value.xml");
		ValueBean vb = ac.getBean("vb",ValueBean.class);
		System.out.println(vb);
		ac.close();
	}
	
	@Test
	//���� ���õķ�ʽע�뼯�����͵�ֵ
	public void test5() {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("value.xml");
		ValueBean vb = ac.getBean("vb2",ValueBean.class);
		System.out.println(vb);
		ac.close();
	}
	
	@Test
	//���� ��ȡproperties�ļ�
	public void test6() {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("value.xml");
		//ValueBean vb = ac.getBean("vb2",ValueBean.class);
		System.out.println(ac.getBean("config"));
		ac.close();
	}
	
	@Test
	//���� ���õķ�ʽע�뼯�����͵�ֵ
	public void test7() {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("some.xml");
		SomeBean sb = ac.getBean("sb",SomeBean.class);
		System.out.println(sb);
		ac.close();
	}
	
	@Test
	//���� spring���ʽ
	public void test8() {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("value.xml");
		SpelBean sb = ac.getBean("sb",SpelBean.class);
		System.out.println(sb);
		ac.close();
	}
	
	@Test
	//���� ���ɨ��
	public void test9() {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
		SomeBean sb = ac.getBean("sb1",SomeBean.class);
		System.out.println(sb);
		ac.close();
	}
	@Test
	//���� ������
	public void test10() {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
		SomeBean sb = ac.getBean("sb1",SomeBean.class);
		SomeBean sb1 = ac.getBean("sb1",SomeBean.class);
		System.out.println(sb==sb1);
		ac.close();
	}
	@Test
	//���� ��������
	public void test11() {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
		SomeBean sb = ac.getBean("sb1",SomeBean.class);
		//System.out.println(sb);
		ac.close();
	}
	@Test
	//���� �ӳټ���
	public void test12() {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
		//SomeBean sb = ac.getBean("sb1",SomeBean.class);
		//System.out.println(sb);
		ac.close();
	}
}
