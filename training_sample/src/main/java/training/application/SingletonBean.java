package training.application;

import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class SingletonBean {

	public SingletonBean() {
		System.out.println("Sinbleton コンストラクタ");
	}
}
