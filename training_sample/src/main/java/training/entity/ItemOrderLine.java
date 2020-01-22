package training.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ItemOrderLine {

	@Id
	@GeneratedValue
	private Long id;
	private String item;
	private Double unitPrice;

	public ItemOrderLine() {
	}

	public ItemOrderLine(String item, Double unitPrice) {
		this.setItem(item);
		this.setUnitPrice(unitPrice);
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
}
