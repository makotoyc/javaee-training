package training.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import training.entity.Book;
import training.service.BookService;

@ManagedBean
@RequestScoped
public class BookListBean {

	@EJB
	private BookService service;

	private List<Book> books;

	@PostConstruct
	public void init() {
		this.books = service.findAll();
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
}
