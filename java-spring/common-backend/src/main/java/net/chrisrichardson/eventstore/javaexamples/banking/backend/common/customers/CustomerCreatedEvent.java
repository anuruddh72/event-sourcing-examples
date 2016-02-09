package net.chrisrichardson.eventstore.javaexamples.banking.backend.common.customers;

import net.chrisrichardson.eventstore.Event;
import net.chrisrichardson.eventstore.javaexamples.banking.common.customers.CustomerInfo;

/**
 * Created by popikyardo on 02.02.16.
 */
public class CustomerCreatedEvent implements Event {

    private String firstName;
    private String lastName;
    private CustomerInfo customerInfo;

    public CustomerCreatedEvent() {
    }

    public CustomerCreatedEvent( String firstName, String lastName, CustomerInfo customerInfo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerInfo = customerInfo;
    }

    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}