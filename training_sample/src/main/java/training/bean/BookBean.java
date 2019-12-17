package training.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import training.service.BookService;

@ManagedBean
@RequestScoped
public class BookBean {

	@EJB
	private BookService bookService;

	public void exec() {
		// day2-1-1
		this.bookService.findAll().forEach(System.out::println);
	}
}
