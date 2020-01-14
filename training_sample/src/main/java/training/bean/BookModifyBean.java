package training.bean;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import training.entity.Book;
import training.service.BookService;

@ManagedBean
@RequestScoped
public class BookModifyBean {

	private Book book;
	@EJB
	private BookService service;

	@PostConstruct
	public void init() {
		this.book = new Book();
	}

	public String find() {
		this.book = this.service.find(this.book.getId());
		return "";
	}

	public String delete() {
		this.service.remove(this.book);
		this.book = null;
		return "";
	}

	public String update() {
		this.service.update(this.book);
		return "";
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
}
