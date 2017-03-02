#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 
 */
package ${package}.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ${package}.api.${service-name}API;
import ${package}.api.${service-name}Service;

/**
 * The Implementaion class for API ${service-name}API
 * @author arp
 *
 */
@RestController
@RequestMapping(${service-name}API.SERVICE_URL)
public class ${service-name}APIImpl implements ${service-name}API {
	
	@Autowired
	private ${service-name}Service service;
	
	/**
	 * Return the ID of the service
	 */
	@GetMapping("/_id")
	public String getServiceId() {
		return ${service-name}API.SERVICE_ID;
	}
}