package de.ait_tr.g_40_shop.service.interfaces;

import de.ait_tr.g_40_shop.domain.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer saveCustomer(Customer customer);
    Customer getCustomerById(Long id);
    List<Customer> getAllCustomers();
}