#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 
 */
package ${package}.service;

import de.arp.depp.api.${service-name}Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * The Implementaion class for Service ${service-name}
 * @author arp
 *
 */
@Service
public class ${service-name}ServiceImpl implements ${service-name}Service {
	
	private static final Logger log = LoggerFactory.getLogger(${service-name}ServiceImpl.class);
	
}