package application.errors.handler.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@ConfigurationProperties
@Component
@PropertySource("classpath:application-errors.properties")
public class ApplicationErrorsProperties {
	 
	private Map<String, String> error = new HashMap<>();

	public Map<String, String> getError() {
		return error;
	}

	public void setError(Map<String, String> error) {
		this.error = error;
	}
}
