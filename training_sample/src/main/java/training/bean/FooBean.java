package training.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class FooBean {

	private String message = "foo";
	
	public String getMessage() {
		return this.message;
	}
}
