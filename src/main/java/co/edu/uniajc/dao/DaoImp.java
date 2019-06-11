package co.edu.uniajc.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class DaoImp implements Dao {

	@Autowired
	SessionFactory session;

	@Override
	public <T> boolean save(Object entityClass) {
		try{
			session.getCurrentSession().save(entityClass);
		}catch(Exception ex){
			return false;
		}
		return true;
	}
	
	@Override
	public <T> boolean update(Object entityClass) {
		try{
			session.getCurrentSession().update(entityClass);
		}catch(Exception ex){
			return false;
		}
		return true;
	}

	@Override
	public <T> boolean delete(Object entityClass) {
		try{
			session.getCurrentSession().delete(entityClass);
		}catch(Exception ex){
			return false;
		}
		
		return true;
	}

	@Override
	public <T> List<T> list(Class<T> entityClass) {
		return session.getCurrentSession().createCriteria(entityClass).list();
	}

	@Override
	public <T> T find(Class<T> entityClass, Serializable id) {
		return (T) session.getCurrentSession().load(entityClass, id);
	}

	@Override
	public <T> List<T> find(String hql) {
		return (List<T>) session.getCurrentSession().createQuery(hql);
	}

	
}
