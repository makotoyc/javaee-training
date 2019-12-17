package training.service;


import javax.enterprise.context.RequestScoped;

import training.service.qualifier.BQualifier;

@RequestScoped
@BQualifier
public class BMessageService implements MessageService {

	@Override
	public String message() {
		return "B-MessageService: message called.";
	}

}
