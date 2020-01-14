package training.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import training.entity.Book;
import training.interceptor.BookInterceptor;

@Stateless
public class BookService {

	@PersistenceContext(unitName="datasource")
	EntityManager em;

	@Interceptors(BookInterceptor.class)
	public List<Book> findAll() {
		// FIXME: 蝗ｺ螳壼�､繧定ｿ泌唆
		TypedQuery<Book> query = em.createNamedQuery("Book.findAll", Book.class);
		List<Book> books = query.getResultList();
		return books;
	}

	public void insert(Book book) {
		em.persist(book);
	}

	@PostConstruct
	public void init() {
		System.out.println("init螳溯｡�");
	}

	@PreDestroy
	public void exit() {
		System.out.println("exit螳溯｡�");
	}
}
