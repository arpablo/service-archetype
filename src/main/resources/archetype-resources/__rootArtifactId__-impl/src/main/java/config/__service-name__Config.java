#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 
 */
package ${package}.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * This class holds the configuration for microservice ${service-name}
 * @author arp
 *
 */
@Configuration
public class ${service-name}Config {
	
	private static Logger logger = LoggerFactory.getLogger(${service-name}Config.class);
	
}