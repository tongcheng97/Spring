package dao;

import java.util.List;

import entity.Emp;
import entity.Emp2;

/*
 * MapperÓ³ÉäÆ÷
 */
public interface EmpDAO {
	public void save(Emp emp);
	public List<Emp> findAll();
	public Emp findById(int id);
	public void modify(Emp emp);
	public void delete(int id);
	public Emp2 findById2(int id);
}
