package com.theorev.service;

import java.util.List;

import org.hibernate.Session;
import com.theorev.util.HibernateUtil;

public abstract class OdontoSoftService<T> implements IOdontoSoft<T> {

	protected Session session;

	@Override
	public boolean create(T t) throws Exception {
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(t);
			session.beginTransaction().commit();
			session.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean update(T t) throws Exception {
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.update(t);
			session.beginTransaction().commit();
			session.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean delete(T t) throws Exception {
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(t);
			session.beginTransaction().commit();
			session.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll(String tabla, String limit) throws Exception {
		List<T> lista = null;

		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			String hql = (limit.equals("")) ? "SELECT t FROM " + tabla + " t"
					: "SELECT t FROM " + tabla + " t LIMIT " + limit;
			lista = session.createQuery(hql).list();
			session.beginTransaction().commit();
			session.close();
		} catch (Exception e) {
			session.getTransaction().rollback();
		} finally {
			session.close();
		}
		return lista;
	}

	// @Override
	// public T findById(Object... valrs) throws Exception {
	// // TODO Auto-generated method stub
	// return null;
	// }
	//
	// @Override
	// public List<T> findBy(Object... valrs) throws Exception {
	// // TODO Auto-generated method stub
	// return null;
	// }

}
