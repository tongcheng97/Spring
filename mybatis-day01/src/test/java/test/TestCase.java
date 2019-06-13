package test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

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
		Emp emp = new Emp();
		emp.setAge(new Double(20));
		emp.setName("°×Óð·²");
		session.insert("test.save", emp);
		session.commit();
		session.close();
	}
	
	@Test 
	public void test2() {
		List<Emp> emps = session.selectList("test.findAll");
		System.out.println(emps);
		session.close();
	}
	
	@Test 
	public void test3() {
		Emp emp = session.selectOne("test.findById", 2);
		System.out.println(emp);
		session.close();
	}
	
	@Test 
	public void test4() {
		Emp emp = session.selectOne("test.findById", 2);
		emp.setAge(emp.getAge()+10);
		session.update("test.modify", emp);
		session.commit();
		session.close();
	}
	
	@Test 
	public void test5() {
		session.delete("test.delete", 4);
		session.commit();
		session.close();
	}
	
	@Test 
	public void test6() {
		Emp2 emp = session.selectOne("test.findById2", 2);
		System.out.println(emp);
		session.close();
	}
}
