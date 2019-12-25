package training.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import training.entity.Book;
import training.interceptor.BookInterceptor;

@Stateless
public class BookService {

	@PersistenceContext(unitName="datasource")
	EntityManager em;

	@Interceptors(BookInterceptor.class)
	public List<Book> findAll() {
		// FIXME: 固定値を返却
		List<Book> books = new ArrayList<>();
		books.add(new Book("isbn1", "Effective Java", 3700));
		books.add(new Book("isbn2", "Design Pattern", 2900));
		return books;
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
