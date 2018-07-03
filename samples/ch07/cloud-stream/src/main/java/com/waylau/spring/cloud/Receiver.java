/**
 * Welcome to https://waylau.com
 */
package com.waylau.spring.cloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * Receiver.
 * 
 * @since 1.0.0 2018年7月3日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@EnableBinding(Sink.class)
public class Receiver {
	private static Logger log = LoggerFactory.getLogger(Receiver.class);

	@StreamListener(Sink.INPUT)
	public void handle(Person person) {
		log.info("Received: " + person);
	}

}
