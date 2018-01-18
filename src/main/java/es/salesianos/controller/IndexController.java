package es.salesianos.controller;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {

	private static Logger log = LogManager.getLogger(IndexController.class);

	@GetMapping("/")
	public String index(Map<String, Object> model) {
		log.debug("entrando a index");
		return "index";
	}

}
