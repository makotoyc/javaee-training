package training.bean;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@RequestScoped
public class BookEntryBean {

	// 登録用フィールド
	private Book book;

	public String entry() {
		// FIXME データの登録は未修
		System.out.println(this.book);
		return "bookEntryResult";
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
}
