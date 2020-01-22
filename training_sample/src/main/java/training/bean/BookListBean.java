package training.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import training.entity.Book;
import training.service.BookService;

@ManagedBean
@RequestScoped
public class BookListBean {

	@EJB
	private BookService service;

	@PostConstruct
	public void init() {
	}

	public List<Book> getBooks() {
		return service.findAll();
	}
}
