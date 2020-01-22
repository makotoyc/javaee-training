package training.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import training.entity.ItemOrder;

@Stateless
public class ItemOrderService {

	@PersistenceContext(unitName="datasource")
	EntityManager em;

	public void persist(ItemOrder itemOrder) {
		em.persist(itemOrder);
	}

	public ItemOrder find(Long id) {
		return em.find(ItemOrder.class, id);
	}

	public List<ItemOrder> findAll() {
		TypedQuery<ItemOrder> query = em.createNamedQuery("ItemOrder.findAll", ItemOrder.class);
		return query.getResultList();
	}

	public void update(ItemOrder itemOrder) {
		em.merge(itemOrder);
	}

	public void remove(ItemOrder itemOrder) {
		ItemOrder rBook = em.find(ItemOrder.class, itemOrder.getId());
		em.remove(rBook);
	}
}
