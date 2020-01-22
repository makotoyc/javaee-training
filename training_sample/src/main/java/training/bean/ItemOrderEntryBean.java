package training.bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import training.entity.ItemOrder;
import training.entity.ItemOrderLine;
import training.service.ItemOrderService;

@ManagedBean
public class ItemOrderEntryBean {

	@EJB
	private ItemOrderService service;

	private ItemOrder itemOrder;

	public String persist() {
		// サンプルなので、固定値を入力
		List<ItemOrderLine> orderLines = new ArrayList<>();
		orderLines.add(new ItemOrderLine("hoihoi", 900.0));
		orderLines.add(new ItemOrderLine("hoihoi2", 900.0));
		orderLines.add(new ItemOrderLine("hoihoi3", 900.0));
		this.itemOrder = new ItemOrder();
		this.itemOrder.setOrderLines(orderLines);

		this.service.persist(this.itemOrder);
		return null;
	}

	public ItemOrder getItemOrder() {
		return itemOrder;
	}

	public void setItemOrder(ItemOrder itemOrder) {
		this.itemOrder = itemOrder;
	}
}
