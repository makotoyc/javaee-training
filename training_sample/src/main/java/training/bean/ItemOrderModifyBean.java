package training.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import training.entity.ItemOrder;
import training.entity.ItemOrderLine;
import training.service.ItemOrderService;

@ManagedBean
public class ItemOrderModifyBean {

	@EJB
	private ItemOrderService service;
	private Long id;
	private ItemOrder itemOrder;

	@PostConstruct
	public void init() {
		this.itemOrder = new ItemOrder();
		List<ItemOrderLine> orderLines = new ArrayList<>();
		this.itemOrder.setOrderLines(orderLines);
	}

	public String find() {
		this.itemOrder = this.service.find(this.id);
		return "";
	}

	public String delete() {
		this.service.remove(this.itemOrder);
		return "";
	}

	public String update() {
		// サンプルなので、固定値で更新
		this.itemOrder.getOrderLines().add(new ItemOrderLine("new line1", 800.0));
		this.itemOrder.getOrderLines().add(new ItemOrderLine("new line2", 700.0));
		this.itemOrder.getOrderLines().add(new ItemOrderLine("new line3", 1000.0));
		this.service.update(this.itemOrder);
		return "";
	}

	public void syso() {
		System.out.println(this.itemOrder);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ItemOrder getItemOrder() {
		return this.itemOrder;
	}

	public void setItemOrder(ItemOrder itemOrder) {
		this.itemOrder = itemOrder;
	}
}
