package lk.ijse.spring.api;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin("*")
public class CustomerController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<CustomerDTO> getcustomer(){

        ArrayList<CustomerDTO>CustomerDTOs= new ArrayList<>();
        CustomerDTOs.add(0,new CustomerDTO("C001","Kamal","Galle"));
        CustomerDTOs.add(1,new CustomerDTO("C002","Kamal","Matara"));
        CustomerDTOs.add(2,new CustomerDTO("C003","Kamal","Colombo"));

        return  CustomerDTOs;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCustomer(@RequestBody CustomerDTO customerDTO){

        System.out.println(customerDTO.toString());
        return;

    }

//    @DeleteMapping(value = "{/id}", consumes = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deleteCustomer(@PathVariable("id") String id){
//        System.out.println(id);
//        return;
//    }

}
