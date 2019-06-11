package co.edu.uniajc.dao;

import java.io.Serializable;
import java.util.List;

public interface Dao {
	
	public <T> boolean save(Object entityClass);
	
	public <T> boolean update(Object entityClass);
	
	public <T> boolean delete(Object entityClass);

	public <T> List<T> list(Class<T> entityClass);
	
	public <T> T find(Class<T> entityClass, Serializable id);
	
	public <T> List<T> find(String hql);
}
