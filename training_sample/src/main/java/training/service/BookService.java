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

	@PostConstruct
	public void init() {
		System.out.println("init螳溯｡�");
	}

	public void persist(Book book) {
		em.persist(book);
	}

	@Interceptors(BookInterceptor.class)
	public List<Book> findAll() {
		TypedQuery<Book> query = em.createNamedQuery("Book.findAll", Book.class);
		return query.getResultList();
	}

	public Book find(Long id) {
		return em.find(Book.class, id);
	}

	public void update(Book book) {
		em.merge(book);
	}

	public void remove(Book book) {
		Book rBook = em.find(Book.class, book.getId());
		em.remove(rBook);
	}

	@PreDestroy
	public void exit() {
		System.out.println("exit螳溯｡�");
	}
}
