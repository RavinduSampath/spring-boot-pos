package com.springboot.spring_boot_pos.controller;

import com.springboot.spring_boot_pos.dto.CustomerDTO;
import com.springboot.spring_boot_pos.entity.Customer;
import com.springboot.spring_boot_pos.service.CustomerService;
import com.springboot.spring_boot_pos.service.impl.CustomerServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController// meke athule innva reponse body kiyal kenek eya thamai mehen yan eva frount end ekt galapen hadal denne 12 row eken gannv nam ek yavankot e prashne enne naththe ekai
//@Controller ==meka dammath pitin en request ganne na,gaththath response karn na
//@ResponseBody ==meka dammath pitin en request ganv.
@RequestMapping("api/v1/customer")
@CrossOrigin//Cross-Origin Resource Sharing,meken karn mokkin en request valt vithrd data denn ona kiyal methn mokuth dal nathi nisa onam ekkt response karnv ex-(facebook.com)
public class CustomerController {


    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO){ //@requestBody ekk type kare frountend eken eken json file gann puluvan venna
//        CustomerServiceIMPL customerServiceIMPL = new CustomerServiceIMPL();
//        customerService.saveCustomer(customerDTO);  //me thiyenne samanyen object ekk hadan vidiya api
//        return "";

        customerService.saveCustomer(customerDTO);
        return "Saved";

    }



//    private final CustomerServiceIMPL customerServiceIMPL;
//
//    public CustomerController(CustomerServiceIMPL customerServiceIMPL) {
//        this.customerServiceIMPL = customerServiceIMPL;
//    }

//    @PostMapping("/save")
//    public String saveCustomer(@RequestBody CustomerDTO customerDTO){ //@requestBody ekk type kare frountend eken eken json file gann puluvan venna
////        String message = customerDTO.getCustomerName();
////        System.out.println("well done "+message);
////        return ("well done "+message);
//
////        return "Customer Saved";
//
////        String message="Customer Saved";
////        return message;
//
//    }
}
