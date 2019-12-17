package training.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import training.bean.Book;

@ManagedBean
@RequestScoped
public class InsertController {

	private Book book;

	public InsertController() {
		this.book = new Book();
	}

	public String entry() {
		System.out.println(this.book);
		return "list";
	}

	public Book getBook() {
		System.out.println("get");
		return book;
	}

	public void setBook(Book book) {
		System.out.println("set");
		this.book = book;
	}
}
