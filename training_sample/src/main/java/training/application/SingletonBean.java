package training.application;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class SingletonBean {

	@PostConstruct
	public void init() {
		System.out.println("Sinbleton コンストラクタ後処理");
	}
}
