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
<<<<<<< HEAD
		// day2-1-1
		this.bookService.findAll().stream()
			.map(book -> book.getTitle()).forEach(System.out::println);
=======
		// FIXME: day2-1-1
		this.bookService.findAll().forEach(System.out::println);
>>>>>>> refs/heads/day2-2-2
	}
}
