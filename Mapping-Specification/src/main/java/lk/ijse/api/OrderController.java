package lk.ijse.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    /*@GetMapping
    public String getOrders(){
        return "getOrders";
    }*/

    @GetMapping
    public String getOrders(@RequestHeader("token") String token){
        return String.format("getOrders (tokens = %s)",token);
    }



}
