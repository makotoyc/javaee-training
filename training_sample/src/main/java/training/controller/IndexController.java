package training.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import training.bean.Book;

@ManagedBean
@RequestScoped
public class IndexController {

	private List<Book> books = new ArrayList<>();

	public IndexController() {
		this.init();
	}

	public List<Book> getBooks() {
		return books;
	}

	public void add(Book book) {
		this.books.add(book);
	}
	
	// FIXME: delete method
	private void init() {
		this.books.add(new Book("dsafds", "hello world", 900));
		this.books.add(new Book());
	}
}
