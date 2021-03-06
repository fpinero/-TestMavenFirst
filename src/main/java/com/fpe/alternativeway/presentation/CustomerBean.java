package com.fpe.alternativeway.presentation;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.fpe.alternativeway.model.Customer;

@ManagedBean
@ViewScoped
public class CustomerBean {
    private List<Customer> customers;
 
    public List<Customer> getCustomers() {
        return customers;
    }
 
    @PostConstruct
    public void setup()  {
        List<Customer> customers = new ArrayList<Customer>();
 
        Customer customer1 = new Customer();
        customer1.setFirstName("John");
        customer1.setLastName("Doe");
        customer1.setCustomerId(123456);
 
        customers.add(customer1);
 
        Customer customer2 = new Customer();
        customer2.setFirstName("Adam");
        customer2.setLastName("Scott");
        customer2.setCustomerId(98765);
 
        customers.add(customer2);
 
        Customer customer3 = new Customer();
        customer3.setFirstName("Jane");
        customer3.setLastName("Doe");
        customer3.setCustomerId(65432);
 
        customers.add(customer3);
        this.customers = customers;
    }
}
