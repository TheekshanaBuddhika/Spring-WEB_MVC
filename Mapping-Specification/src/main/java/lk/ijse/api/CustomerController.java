package lk.ijse.api;

import lk.ijse.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping
    public String getAllCustomer(){
        return "custosTOMER";
    }

/*@GetMapping("{city}")
    public  String getString(@PathVariable("city") String city) {
        return String.format("getCustomer(%s)+city",city);
    }

    @GetMapping("/{city}/{kin}")
    public  String getString3(@PathVariable("city") String city,@PathVariable("kin") String kin) {
        return String.format("getCustomer(%s,%s)+city",city,kin);
    }*/

   /* @GetMapping("/{id:C\\d{3}}")
    public  String getString4(@PathVariable ("id") String id) {
        return String.format("getCustomer(%s)",id);
    }*/

//    @PostMapping(value = "/list")
//    public String getcussave( CustomerDTO customerDTO){
//             return String.format("Save customer id : %s \n name : %s \n age : %s",customerDTO.getId(),customerDTO.getName(),customerDTO.getAge());
//    }

    @PostMapping(value = "/test")
    public String getcussave(@RequestBody CustomerDTO customerDTO){
//        return String.format("Save customer id : %s \n name : %s \n age : %s",customerDTO.getId(),customerDTO.getName(),customerDTO.getAge());
  //      return String.format("Save customer id : %s \n name : %s \n age : %s",id,name,age);
        return customerDTO.toString();
    }

    @GetMapping(value = "/getall")
    public CustomerDTO getall(){
        return new CustomerDTO("C001","Kamal","45");
    }
}
