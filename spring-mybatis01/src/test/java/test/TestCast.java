package test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmpDAO;
import entity.Emp;

public class TestCast {
	@Test
	public void test1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringConfig.xml");
		EmpDAO dao = ac.getBean("empDAO",EmpDAO.class);
		Emp emp = new Emp();
		emp.setAge(new Double(23));
		emp.setName("hhh");
		dao.save(emp);
	}
	
	@Test
	public void test2() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringConfig.xml");
		EmpDAO dao = ac.getBean("empDAO",EmpDAO.class);
		List<Emp> emps = dao.findAll();
		System.out.println(emps);
	}
	
	@Test
	public void test3() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringConfig.xml");
		EmpDAO dao = ac.getBean("empDAO",EmpDAO.class);
		Emp emp = dao.findById(2);
		System.out.println(emp);
	}
	
	@Test
	public void test4() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringConfig.xml");
		EmpDAO dao = ac.getBean("empDAO",EmpDAO.class);
		Emp emp = dao.findById(8);
		emp.setAge(new Double(40));
		dao.modify(emp);
	}
	
	@Test
	public void test5() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringConfig.xml");
		EmpDAO dao = ac.getBean("empDAO",EmpDAO.class);
		dao.delete(7);
	}
}
