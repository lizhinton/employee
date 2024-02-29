/**
 * Liz Hinton
 * CIS175 - Fall 2023
 * Feb 29, 2024
 */
package controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.Address;
import beans.employee;

@Configuration
public class beanConfig {
	@Bean
	public employee employee() {
		employee bean = new employee( );
		bean.setName("neil gaiman");
		bean.setPhone("111-666-4444");
		bean.setPosition("writer");
		return bean;
	}
	
	@Bean
	public Address address() {
		Address bean = new Address("134 Millwheel Ln", "Tucson", "AZ");
		return bean;
	}
}
