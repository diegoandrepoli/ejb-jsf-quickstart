package com.control.generic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

/**
 * Generic data access object
 * @author Diego Andre Poli <diegoandrepoli@gmail.com>
 * @param <T> the object persist
 */
public abstract class GenericDAO<T> {

	/**
	 * Unit control name
	 */
	private final static String UNIT_NAME = "Control";

	/**
	 * Entity manager
	 */
	@PersistenceContext(unitName = UNIT_NAME)
	private EntityManager em;

	/**
	 * Entity class
	 */
	private Class<T> entityClass;

	/**
	 * Custom construct to set entity class
	 * @param entity class
	 */
	public GenericDAO(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	/**
	 * Save entity
	 * @param entity
	 */
	public void save(T entity) {
		em.persist(entity);
	}

	/**
	 * Remove entity
	 * @param entity
	 */
	public void delete(T entity) {
		T entityToBeRemoved = em.merge(entity);
		em.remove(entityToBeRemoved);
	}

	/**
	 * Update entity
	 * @param entity
	 * @return data object
	 */
	public T update(T entity) {
		return em.merge(entity);
	}

	/**
	 * Find entity by identification
	 * @param entity identification
	 * @return entity object
	 */
	public T find(int entityId) {
		return em.find(entityClass, entityId);
	}

	/**
	 * Get all entity
	 * @return list of entity object
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<T> getAll() {
		CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
		cq.select(cq.from(entityClass));
		return em.createQuery(cq).getResultList();
	}
}
