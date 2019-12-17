package training.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class SampleBean {

	private String message = "bbbbhello, world.";
	
	public String getMessage() {
		return message;
	}
}
