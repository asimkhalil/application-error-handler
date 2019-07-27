package application.errors.handler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.errors.handler.service.ApplicationErrorService;

@RestController
@RequestMapping(value = "/errorservice")
public class ApplicationErrorController {

	@Autowired
	private ApplicationErrorService applicationErrorService;

	@GetMapping(value = "/description/{errorcode}", produces = MediaType.TEXT_PLAIN_VALUE)
	public String getErrorDescrription(@PathVariable String errorcode) throws Exception {
		return applicationErrorService.getDescription(errorcode);
	}
}
