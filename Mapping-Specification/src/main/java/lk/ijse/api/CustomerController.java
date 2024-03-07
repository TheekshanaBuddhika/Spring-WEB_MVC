package lk.ijse.api;

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

    @GetMapping("/list")
    public String getcussave(@RequestParam("id") String id ,@RequestParam("name")String name ,@RequestParam("age")String age ){
        return String.format("Save customer id : %s \n name : %s \n age : %s",id,name,age);
    }
}
