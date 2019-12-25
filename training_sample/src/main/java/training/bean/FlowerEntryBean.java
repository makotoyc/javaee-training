package training.bean;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

import training.entity.Flower;
import training.service.FlowerService;

@ManagedBean
@RequestScoped
public class FlowerEntryBean {

	// 登録用フィールド
	private Flower flower;
	@EJB
	private FlowerService service;

	@PostConstruct
	public void init() {
		this.flower = new Flower();
	}

	public String entry() {
		System.out.println(this.flower);
		this.service.create(this.flower);
		return "bookEntryResult";
	}

	public Flower getFlower() {
		return flower;
	}

	public void setFlower(Flower flower) {
		this.flower = flower;
	}
}
