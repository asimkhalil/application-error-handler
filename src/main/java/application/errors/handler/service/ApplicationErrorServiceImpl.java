package application.errors.handler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.errors.handler.config.ApplicationErrorsProperties;

@Service
public class ApplicationErrorServiceImpl implements ApplicationErrorService {

	@Autowired
	private ApplicationErrorsProperties errorProperties;
	
	@Override
	public String getDescription(String errorCode) throws Exception {

		return errorProperties.getError().get(errorCode);
	
	}
	
}
