package training.application;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class SingletonBean {

	public SingletonBean() {
		System.out.println("#### SingletonBean: Construction Message: " + this.toString());
	}

	@PostConstruct
	public void init() {
		System.out.println("#### SingletonBean: PostConstruct Message: " + this.toString());
	}
}
