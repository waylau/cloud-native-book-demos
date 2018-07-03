/**
 * 
 */
package com.waylau.spring.cloud;

/**
 * Person.
 * 
 * @since 1.0.0 2018年7月3日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name;
	}
}
