#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 
 */
package ${package}.api;

/**
 * Basic Runtime Exception throw by the microservice ${service-name}
 * @author arp
 *
 */
public class ${service-name}Exception extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * Default Constructor
	 */
	public ${service-name}Exception() {

	}

	/**
	 * Constructor
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ${service-name}Exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * Constructor
	 * @param message
	 * @param cause
	 */
	public ${service-name}Exception(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructor
	 * @param message
	 */
	public ${service-name}Exception(String message) {
		super(message);
	}

	/**
	 * Constructor
	 * @param cause
	 */
	public ${service-name}Exception(Throwable cause) {
		super(cause);
	}
	
}
