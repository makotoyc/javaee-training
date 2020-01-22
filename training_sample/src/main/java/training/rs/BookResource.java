package training.rs;

import java.net.URI;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import training.entity.Book;
import training.service.BookService;

@Path("/book")
@RequestScoped
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class BookResource {

	@Context
	private UriInfo uriInfo;

	@EJB
	private BookService service;

	@GET
	@Path("{id}")
	public Book getBook(@PathParam("id") Long id) {
		Book book = this.service.find(id);

		if (book != null) {
			return book;
		} else {
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
	}

	@GET
	public List<Book> getBooks() {
		return this.service.findAll();
	}

	@POST
	public Response insertBook(Book book) {
		this.service.persist(book);
		System.out.println(book.getId());
		URI bookUri = uriInfo.getAbsolutePathBuilder().path(book.getId().toString()).build();
		return Response.created(bookUri).build();
	}
}
