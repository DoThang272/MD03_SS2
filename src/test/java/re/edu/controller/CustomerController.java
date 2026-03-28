package re.edu.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import re.edu.model.Customer;
import re.edu.service.ICustomerSevice;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers") //DDuong dan chung cho resource product
public class CustomerController {
//    Muốn sử dụng các logic từ service thì ta phải tiêm bean service vào

//    Khai báo đối tượng service
    ICustomerSevice customerSevice;

    public CustomerController(ICustomerSevice customerSevice) {
        this.customerSevice = customerSevice;
    }

    //    Lấy danh sách
    @GetMapping
    public List<Customer> getAllCustomers(@RequestParam(required = false) String name){
        if(name != null){
            return customerSevice.findByName(name);
        }
//        Nếu không tìm kiếm gì thì sẽ là getAll()
        return customerSevice.getAll();
    }

//    them moi kh
    @PostMapping
    public String addNewCustomer(@RequestBody Customer customer){
        customerSevice.addCustomer(customer);
        return "Theem moi thanh cong";
    }

//    Cap nhat kh
    @PutMapping("/{id}")
    public Customer updateCustomer(@RequestBody Customer customer,@PathVariable String id){
        customerSevice.updateCustomer(customer, id);
        return customer;
    }

//    Xoa kh
    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable String id){
        customerSevice.deleteCustomer(id);
        return "Xoa thanh cong";
    }

//    Lay kh theo ten(tuong doi)
//    @GetMapping
//    public List<Customer> findCusByName(@RequestParam(required = false) String name){
//        if(name!=null){
//            return customerSevice.findByName(name);
//        }
//        return null;
//    }
}
