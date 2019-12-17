package training.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import training.entity.Book;

@ManagedBean
@RequestScoped
public class BookListBean {

	private List<Book> books;

	@PostConstruct
	public void init() {
		this.books = new ArrayList<>();
		this.books.add(new Book("978-4111770106", "楽譜サンプル", 900));
		this.books.add(new Book("978-4118970106", "サンプル書籍", 2900));
		this.books.add(new Book("978-9873217316", "ハロー・ワールド", 1100));
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
}
