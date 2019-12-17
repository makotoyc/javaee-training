package training.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class CountBean implements Serializable {

	private static final long serialVersionUID = 9218323845882633106L;

	int count;

	public CountBean() {
	}

	public void add() {
		count++;
	}

	public int getCount() {
		return count;
	}

}
