package com.waylau.spring.cloud.weather.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * Hi Controller.
 * 
 * @since 1.0.0 2018年7月5日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@RestController
public class HiController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/hi")
	@HystrixCommand(fallbackMethod = "defaultData")
	public String sayHi() {
		// REST 客户端来查找
		URI uri = URI.create("http://localhost:8080/hello");

		String body = restTemplate.getForObject(uri, String.class);
		return body;
	}

	/**
	 * 自定义断路器默认返回的内容
	 * @return
	 */
	public String defaultData() {
        return "服务暂时不可用！";
    }
}
