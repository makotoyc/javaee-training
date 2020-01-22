package training.service;

import javax.enterprise.context.RequestScoped;

import training.service.qualifier.AQualifier;

@RequestScoped
@AQualifier
public class AMessageService implements MessageService {

	@Override
	public String message() {
		return "A-MessageService: message called.";
	}

}
