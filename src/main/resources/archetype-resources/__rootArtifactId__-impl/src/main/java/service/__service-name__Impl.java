#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 
 */
package ${package}.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ${package}.api.${service-name}API;

/**
 * The Implementaion class for Service ${service-name}
 * @author arp
 *
 */
@RestController
@RequestMapping(${service-name}API.SERVICE_URL)
public class ${service-name}Impl {
	
	/**
	 * Return the ID of the service
	 */
	@GetMapping("/_id")
	public String getServiceId() {
		return ${service-name}API.SERVICE_ID;
	}
}