package training.bean;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import training.entity.ItemOrder;
import training.service.ItemOrderService;

@ManagedBean
public class ItemOrderListBean {

	@EJB
	private ItemOrderService service;

	public List<ItemOrder> getItemOrders() {
		return this.service.findAll();
	}

}
