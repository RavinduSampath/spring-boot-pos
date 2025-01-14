package com.springboot.spring_boot_pos.controller;

import com.springboot.spring_boot_pos.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController// meke athule innva reponse body kiyal kenek eya thamai mehen yan eva frount end ekt galapen hadal denne 12 row eken gannv nam ek yavankot e prashne enne naththe ekai
@RequestMapping("api/v1/customer")
@CrossOrigin//Cross-Origin Resource Sharing,meken karn mokkin en request valt vithrd data denn ona kiyal methn mokuth dal nathi nisa onam ekkt response karnv ex-(facebook.com)
public class CustomerController {

    @PostMapping("/save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO){ //@requestBody ekk type kare frountend eken eken json file gann puluvan venna
        String message = customerDTO.getCustomerName();
        System.out.println("well done "+message);
        return ("well done "+message);

//        return "Customer Saved";

//        String message="Customer Saved";
//        return message;
    }
}
