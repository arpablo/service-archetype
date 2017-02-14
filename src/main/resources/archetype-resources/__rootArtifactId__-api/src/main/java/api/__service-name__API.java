#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 
 */
package ${package}.api;

import feign.Headers;
import feign.RequestLine;

/**
 * This interface defines the microservice ${service-name}
 * @author arp
 *
 */
public interface ${service-name}API {

	public static final String SERVICE_ID = "${service-name}-microservice";
	public static final String SERVICE_URL = "/${service-prefix}/api/${service-version}";
	
	@Headers("Content-Type: text/plain")
	@RequestLine("GET " + SERVICE_URL + "/_id")
	String getServiceId();
	
}
