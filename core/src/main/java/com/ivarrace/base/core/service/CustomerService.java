package com.ivarrace.base.core.service;

import com.ivarrace.base.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import com.ivarrace.base.data.mongo.dao.CustomerDao;

import java.util.List;

@Service
@ComponentScan("com.ivarrace.base.data.mongo.dao")
public class CustomerService {

    Logger logger = LoggerFactory.getLogger(TestService.class);

    @Autowired
    private CustomerDao customerDao;

    public List<Customer> findAll() {
        logger.debug("findAll");
        return customerDao.findAll();
    }

    public List<Customer> findByFirstName(String firstName){
        logger.debug(firstName, "findByFirstName: %s");
        return customerDao.findByFirstName(firstName);
    }

    public List<Customer> findByLastName(String lastName){
        logger.debug(lastName, "findByLastName: %s");
        return customerDao.findByLastName(lastName);
    }
}
