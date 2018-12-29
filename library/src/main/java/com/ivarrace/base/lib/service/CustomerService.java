package com.ivarrace.base.lib.service;

import com.ivarrace.base.data.mongo.dao.CustomerRepository;
import com.ivarrace.base.data.mongo.entity.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@EnableMongoRepositories("com.ivarrace.base.data.mongo.dao")
public class CustomerService {

    Logger logger = LoggerFactory.getLogger(TestService.class);

    @Autowired
    private CustomerRepository repository;

    public List<Customer> findAll() {
        initRepo();
        logger.debug("findAll");
        return repository.findAll();
    }

    public List<Customer> findByFirstName(String firstName){
        initRepo();
        logger.debug(firstName, "findByFirstName: %s");
        return repository.findByFirstName(firstName);
    }

    public List<Customer> findByLastName(String lastName){
        initRepo();
        logger.debug(lastName, "findByLastName: %s");
        return repository.findByLastName(lastName);
    }

    private void initRepo(){
        logger.debug("Reset database . . .");
        repository.deleteAll();

        // save a couple of customers
        repository.save(new Customer("Alice", "Smith"));
        repository.save(new Customer("Bob", "Smith"));
    }

}
