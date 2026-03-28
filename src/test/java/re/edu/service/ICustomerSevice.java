package re.edu.service;

import re.edu.model.Customer;

import java.util.List;

public interface ICustomerSevice {
    List<Customer> getAll();
    Customer findById(String idCustomer);
    Customer addCustomer(Customer customer);
    Customer updateCustomer(Customer customer, String idCustomer);
    Customer deleteCustomer(String idCustomer);
    List<Customer> findByName(String nameCustomer);
}
