package ir.tamin.demo;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name="customer-service")
public interface CustomerService {

    @RequestMapping(value="/customer/{id}", method= RequestMethod.GET)
    Customer getCustomerById(@PathVariable("id") int id);


    @RequestMapping(value="/customers", method= RequestMethod.GET)
    List<Customer> getAllCustomers();

}
