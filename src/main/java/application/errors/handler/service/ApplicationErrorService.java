package application.errors.handler.service;

import org.springframework.stereotype.Service;

@Service
public interface ApplicationErrorService {
	
	public String getDescription(String errorCode) throws Exception;
	
}
