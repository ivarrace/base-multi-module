package com.ivarrace.base.data.mongo.dao;

import com.ivarrace.base.data.mongo.converter.GenericConverter;
import com.ivarrace.base.data.mongo.entity.CustomerEntity;
import com.ivarrace.base.data.mongo.repository.CustomerRepository;
import com.ivarrace.base.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@EnableMongoRepositories("com.ivarrace.base.data.mongo.repository")
@ComponentScan("com.ivarrace.base.data.mongo")
public class CustomerDao {

    Logger logger = LoggerFactory.getLogger(CustomerDao.class);

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private GenericConverter converter;

    public List<Customer> findAll() {
        logger.debug("findAll");
        List<CustomerEntity> customerEntityList = customerRepository.findAll();
        return customerEntityList.stream()
                .map(customerEntity -> converter.convert(customerEntity, Customer.class))
                .collect(Collectors.toList());
    }

    public List<Customer> findByFirstName(String firstName){
        logger.debug(firstName, "findByFirstName: %s");
        List<CustomerEntity> customerEntityList = customerRepository.findByFirstName(firstName);
        return customerEntityList.stream()
                .map(customerEntity -> converter.convert(customerEntity, Customer.class))
                .collect(Collectors.toList());
    }

    public List<Customer> findByLastName(String lastName){
        logger.debug(lastName, "findByLastName: %s");
        List<CustomerEntity> customerEntityList = customerRepository.findByLastName(lastName);
        return customerEntityList.stream()
                .map(customerEntity -> converter.convert(customerEntity, Customer.class))
                .collect(Collectors.toList());
    }
}
