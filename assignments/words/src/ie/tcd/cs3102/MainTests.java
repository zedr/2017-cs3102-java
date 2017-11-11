package com.example.cs3102;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.cs3102.Customer;

public class MyClassTests {

    @Test
    public void hasValidBirthDate() {
        Customer customer = new Customer();
        assertTrue(customer.getPIN() > 999);
    }
}

