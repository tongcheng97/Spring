package dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import annotation.MybatisRepository;
import entity.Emp;

/*
 * Mapper”≥…‰∆˜
 */
@Repository("empDAO")
@MybatisRepository
public interface EmpDAO {
	public void save(Emp emp);
	public List<Emp> findAll();
	public Emp findById(int id);
	public void modify(Emp emp);
	public void delete(int id);
}
