package training.bean;

<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> refs/heads/day1-3-2
import javax.annotation.PostConstruct;
<<<<<<< HEAD
>>>>>>> refs/heads/day1-3-1
=======
import javax.ejb.EJB;
>>>>>>> refs/heads/day3-1-2
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

import training.entity.Book;
import training.service.BookService;

@ManagedBean
@RequestScoped
public class BookEntryBean {

	// 逋ｻ骭ｲ逕ｨ繝輔ぅ繝ｼ繝ｫ繝�
	private Book book;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> refs/heads/day1-3-2
//	private List<Book> books;
=======
	@EJB
	private BookService service;
>>>>>>> refs/heads/day3-1-2

	@PostConstruct
	public void init() {
		this.book = new Book();
	}
>>>>>>> refs/heads/day1-3-1

	public String entry() {
<<<<<<< HEAD
		// FIXME データの登録は未修
		System.out.println(this.book);
<<<<<<< HEAD
<<<<<<< HEAD
=======
//		this.books.add(this.book);
>>>>>>> refs/heads/day1-3-1
=======
//		this.books.add(this.book);
>>>>>>> refs/heads/day1-3-2
=======
		this.service.persist(this.book);
>>>>>>> refs/heads/day3-1-2
		return "bookEntryResult";
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
<<<<<<< HEAD
<<<<<<< HEAD
=======

//	public List<Book> getBooks() {
//		return books;
//	}
//
//	public void setBooks(List<Book> books) {
//		this.books = books;
//	}
<<<<<<< HEAD
>>>>>>> refs/heads/day1-3-1
=======
>>>>>>> refs/heads/day1-3-2
=======
>>>>>>> refs/heads/day3-1-2
}
