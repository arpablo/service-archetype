#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 
 */
package ${package}.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author arp
 *
 */
@Controller
public class ${service-name}Controller {

	@GetMapping("/")
	public String index() {
		return "index";
	}
}
