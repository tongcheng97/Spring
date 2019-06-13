package test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import dao.EmpDAO;
import entity.Emp;
import entity.Emp2;

public class TestCase {
	private SqlSession session;

	@Before
	public void init() {
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		SqlSessionFactory ssf = ssfb.build(TestCase.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml"));
		session = ssf.openSession();
	}
	
	@Test
	public void test1() {
		/**
		 *  getMapper方法返回一个符合Mapper映射器（EmpDAO）要求的对象
		 */
		EmpDAO dao = session.getMapper(EmpDAO.class);
		Emp emp = new Emp();
		emp.setName("bbc");
		emp.setAge(new Double(20));
		dao.save(emp);
		session.commit();
		session.close();
	}
	
	@Test
	public void test2() {
		EmpDAO dao = session.getMapper(EmpDAO.class);
		List<Emp> emps = dao.findAll();
		System.out.println(emps);
		session.close();
	}
	
	@Test
	public void test3() {
		EmpDAO dao = session.getMapper(EmpDAO.class);
		Emp emp = dao.findById(2);
		System.out.println(emp);
		session.close();
	}
	
	@Test
	public void test4() {
		EmpDAO dao = session.getMapper(EmpDAO.class);
		Emp emp = dao.findById(6);
		emp.setAge(emp.getAge()+10);
		emp.setName("白羽凡");
		dao.modify(emp);
		session.commit();
		session.close();
	}
	
	@Test
	public void test5() {
		EmpDAO dao = session.getMapper(EmpDAO.class);
		dao.delete(5);
		session.commit();
		session.close();
	}
	
	@Test
	public void test6() {
		EmpDAO dao = session.getMapper(EmpDAO.class);
		Emp2 emp2 = dao.findById2(2);
		System.out.println(emp2);
		session.close();
	}
	
}
