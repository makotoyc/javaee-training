package training.bean;

import java.util.Date;

import javax.faces.bean.ManagedBean;
<<<<<<< HEAD
import javax.faces.bean.RequestScoped;
=======
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
>>>>>>> refs/heads/day1-3-1

@ManagedBean
@RequestScoped
public class Book {

<<<<<<< HEAD
=======
	@NotNull
>>>>>>> refs/heads/day1-3-1
	private String isbn = "none";
<<<<<<< HEAD
=======

	@NotNull
	@Size(min = 1, max = 255)
>>>>>>> refs/heads/day1-3-1
	private String title = "no title";

	@Min(0)
	private Integer price = 0;

	@NotNull
	@Size(min = 1, max = 255)
	private String description = "desc";

	private Date publishedDate = new Date();

	public Book() {
	}

	public Book(String isbn, String title, Integer price) {
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + ", publishedDate=" + publishedDate
				+ "]";
	}

}
