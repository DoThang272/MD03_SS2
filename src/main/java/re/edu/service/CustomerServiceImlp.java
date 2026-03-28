package re.edu.service;

import org.springframework.stereotype.Service;
import re.edu.model.Customer;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImlp implements ICustomerSevice {
    private List<Customer> listCustomer = new ArrayList<>();

    public CustomerServiceImlp() {
        this.listCustomer = new ArrayList<>();
        listCustomer.add(new Customer("c001", "Thang", "Do" , "2007-12-03T10:15:30", "Ha Noi","0397269518","014012309199"));
        listCustomer.add(new Customer("c002", "Quyet", "Do" , "2001-11-10T10:15:30", "Hai Duong","039124218","014277172389"));
        listCustomer.add(new Customer("c003", "Hoai", "Thu" , "2003-02-21T10:15:30", "Son La","0397819237","0140100394829"));
    }

    @Override
    public List<Customer> getAll() {
        return listCustomer;
    }

    @Override
    public Customer findById(String idCustomer) {
        return listCustomer.stream().filter(c -> c.getIdCustomer().equals(idCustomer)).findFirst().orElse(null);
    }

    @Override
    public Customer addCustomer(Customer customer) {
        listCustomer.add(customer);
        return customer;
    }

    @Override
    public Customer updateCustomer(Customer customer, String idCustomer) {
        Customer c = findById(idCustomer);
        if (c!=null){
            if (c != null){
                c.setSurname(customer.getSurname());
                c.setLastname(customer.getLastname());
                c.setAddress(customer.getAddress());
                c.setPhone(customer.getLastname());
                return c;
            }
        }
        return null;
    }


    @Override
    public Customer deleteCustomer(String idCustomer) {
        Customer customer = findById(idCustomer);
        if (customer != null){
            listCustomer.remove(customer);
            return customer;
        }
        return null;
    }

    @Override
    public List<Customer> findByName(String nameCustomer) {
        return listCustomer.stream()
                .filter(c -> {
                    String fullName = (c.getSurname() + " " + c.getLastname()).toLowerCase();
                    return fullName.contains(nameCustomer.toLowerCase());
                })
                .toList();
    }
}
