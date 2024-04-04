package lk.ijse.spring.api;

import jakarta.validation.Valid;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Base64;

@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin("*")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<CustomerDTO> getcustomer(){

        return  customerService.getAllCustoemr();
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerDTO saveCustomer(@Valid @RequestPart("id") String id ,@RequestPart("name") String name , @RequestPart("address") String address, @RequestPart("profilePic") String profilepic ){
        String base64Profilepic = Base64.getEncoder().encodeToString(profilepic.getBytes());
        CustomerDTO customer = new CustomerDTO(id,name,address,base64Profilepic);
        return customerService.saveCustomer(customer);

    }


    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public  void updateCustomer(@Valid @RequestBody CustomerDTO customerDTO ){

        customerService.updateCustomer(customerDTO);

    }



//    @DeleteMapping(value = "{/id}", consumes = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deleteCustomer(@PathVariable("id") String id){
//        System.out.println(id);
//        return;
//    }

}
