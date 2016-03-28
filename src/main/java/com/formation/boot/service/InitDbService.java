package com.formation.boot.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.boot.entity.Customer;
import com.formation.boot.repository.CustomerRepository;

@Service
public class InitDbService {

	@Autowired
	private CustomerRepository customerRepository;

	@PostConstruct
	public void init() {
		{
			Customer customer = new Customer();
			customer.setName("Ayoub");
			customerRepository.save(customer);
		}
		{
			Customer customer = new Customer();
			customer.setName("Sanoua");
			customerRepository.save(customer);
		}
	}
}
