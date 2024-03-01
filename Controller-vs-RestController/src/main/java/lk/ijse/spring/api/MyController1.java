package lk.ijse.spring.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
public class MyController1 {
    public MyController1() {
        System.out.println("My Controller1 - constructor");
    }

    @GetMapping
    public String getMethod(){
        return "Mycontroller1";
    }

}
