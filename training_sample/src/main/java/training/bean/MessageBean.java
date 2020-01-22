package training.bean;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import training.service.MessageService;
import training.service.qualifier.AQualifier;

@ManagedBean
@RequestScoped
public class MessageBean {
	@Inject
	@AQualifier
	private MessageService service;

//	@Inject
//	@BQualifier
//	private MessageService service;
	
	private String message;
	
	public MessageBean() {
	}

	@PostConstruct
	public void init() {
		message = service.message();
	}
	
	public String getMessage() {
		return message;
	}
	
}
