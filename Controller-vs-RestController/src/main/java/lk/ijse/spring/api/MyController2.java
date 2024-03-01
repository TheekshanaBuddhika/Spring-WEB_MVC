package lk.ijse.spring.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/two")
public class MyController2 {
    public MyController2() {
        System.out.println("MyController2 - constructor");
    }

    @GetMapping
    public String getMethod(){
        return "<h1>Mycontroller2<h1>";
    }

}
