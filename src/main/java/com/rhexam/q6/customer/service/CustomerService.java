package com.rhexam.q6.customer.service;

import com.rhexam.q6.customer.domain.Customer;
import com.rhexam.q6.customer.domain.CustomerSearchCriteria;

import java.util.List;

/**
 * Created by jhorton on 11/5/16.
 */
public interface CustomerService {

    /**
     •	Return type is List<Customer>
     •	Caller will specify a search criteria with several search fields. Each search field can be a customer field, or an address field. For instance, it should be possible to search for all customers living in a certain state with a given last name.
     •	Caller can specify a sort field and sort order in which the results will be returned.
     •	Implementation will be stateless.
     •	API must limit number of records returned by each call to protect against very large result sets.

     Write the API signature, and any other class required by that API. Write the API as a Java interface. Do not write an implementation for the interface.

     */
    List<Customer> searchCustomers(CustomerSearchCriteria criteria);

}
