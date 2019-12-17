package training.bean;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

import training.entity.Book;

@ManagedBean
@RequestScoped
public class BookEntryBean {

	// 登録用フィールド
	private Book book;
//	private List<Book> books;

	@PostConstruct
	public void init() {
		this.book = new Book();
//		// booksの初期化
//		// FIXME: データの取得は
//		this.books = new ArrayList<>();
//		this.books.add(new Book("isbn", "タイタニック", 900));
//		this.books.add(new Book("isbn2", "フローズン", 1200));
	}

	public String entry() {
		// FIXME データの登録は未修
		System.out.println(this.book);
//		this.books.add(this.book);
		return "bookEntryResult";
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

//	public List<Book> getBooks() {
//		return books;
//	}
//
//	public void setBooks(List<Book> books) {
//		this.books = books;
//	}
}
