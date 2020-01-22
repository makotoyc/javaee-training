package training.bean;

<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> refs/heads/day1-3-2
import javax.annotation.PostConstruct;
>>>>>>> refs/heads/day1-3-1
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@RequestScoped
public class BookEntryBean {

	// 登録用フィールド
	private Book book;
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> refs/heads/day1-3-2
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
>>>>>>> refs/heads/day1-3-1

	public String entry() {
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
		return "bookEntryResult";
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
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
}
