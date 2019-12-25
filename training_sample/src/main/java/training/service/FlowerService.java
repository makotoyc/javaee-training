package training.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import training.entity.Flower;

@Stateless
public class FlowerService {

	@PersistenceContext(unitName="datasource")
	EntityManager em;

	public void create(Flower flower) {
		em.persist(flower);
	}
}
