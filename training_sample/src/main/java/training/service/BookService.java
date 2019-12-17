package training.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import training.entity.Book;

@Stateless
public class BookService {

	public List<Book> findAll() {
		// 固定値を返却
		List<Book> books = new ArrayList<>();
		books.add(new Book("isbn1", "Effective Java", 3700));
		books.add(new Book("isbn2", "Design Pattern", 2900));
		return books;
	}
}
