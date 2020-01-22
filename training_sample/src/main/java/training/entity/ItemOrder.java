package training.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name = "ItemOrder.findAll", query = "SELECT o FROM ItemOrder o")
public class ItemOrder {

	@Id
	@GeneratedValue
	private Long id;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn
	private List<ItemOrderLine> orderLines;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<ItemOrderLine> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(List<ItemOrderLine> orderLines) {
		this.orderLines = orderLines;
	}
	
}
