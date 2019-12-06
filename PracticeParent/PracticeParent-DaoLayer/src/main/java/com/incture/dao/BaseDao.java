/**
 * Shruti.Bodhe
 * 2019-11-29
 */
package com.incture.dao;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.incture.dto.BaseDto;
import com.incture.entity.BaseDo;

@Repository("BaseDao")
public abstract class BaseDao<E extends BaseDo, D extends BaseDto> {

	@Autowired
	private SessionFactory sessionFactory;

	public abstract E importDto(D dto);

	public abstract D exportDto(E entity);

	public Session getSession() {
		try {
			return sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			return sessionFactory.openSession();
		}
	}

	public StatelessSession getStatelessSession() {
		return sessionFactory.openStatelessSession();
	}

	public void persist(E entity) {
		getSession().persist(entity);

	}

	public String save(E entity) {
		String primaryKey = (String) getSession().save(entity);

		return primaryKey;
	}

	public void update(E entity) {
		getSession().update(entity);

	}

	public void delete(E entity) {
		getSession().delete(entity);

	}

	@SuppressWarnings("unchecked")
	public E get(E entity) {
		E result = (E) getSession().get(entity.getClass(), (Serializable) entity.getPrimaryKey());
		return result;
	}

}
