package training.bean;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

import training.entity.Book;
import training.service.BookService;

@ManagedBean
@RequestScoped
public class BookEntryBean {

	// 逋ｻ骭ｲ逕ｨ繝輔ぅ繝ｼ繝ｫ繝�
	private Book book;
	@EJB
	private BookService service;

	@PostConstruct
	public void init() {
		this.book = new Book();
	}

	public String entry() {
		this.service.persist(this.book);
		return "bookEntryResult";
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
}
