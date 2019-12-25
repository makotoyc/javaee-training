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
	public List<Book> findAll(){
		TypedQuery<Book> query = em.createNamedQuery("Book.findAll", Book.class);
		return query.getResultList();
	}

	public void insert(Book book) {
		em.persist(book);
	}

	@PostConstruct
	public void init() {
		System.out.println("init実行");
	}

	@PreDestroy
	public void exit() {
		System.out.println("exit実行");
	}
}
