#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 
 */
package ${package}.controller;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import de.arp.depp2.api.${service-name}Service;


/**
 * @author arp
 *
 */
@Controller
public class ${service-name}Controller {

	private static Logger logger = LoggerFactory.getLogger(${service-name}Controller.class);
	
	@Autowired
	private ${service-name}Service service;
	
	@PostConstruct
	public void init() {
		if (service != null) {
			logger.info("Service '${service-name}' is using implementation class {}",service.getClass().getName());
		}
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
}
