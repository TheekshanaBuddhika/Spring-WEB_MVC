package lk.ijse.spring.bean;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWebMVC {


    public HelloWebMVC() {
//        System.out.println("HelloMvc - constructor");
    }

    @GetMapping
    public String myMethod(){
        System.out.println("MyMethod is invoked");
        return "MyMethod";
    }

    @PostMapping
    public String myPost(){
        return "post";
    }

    @PutMapping
    public String myPut(){
        return "put";
    }

    @DeleteMapping
    public  String myDelete(){
        return "delete";
    }

    @PatchMapping
    public String myPatch(){
        return "Patch";
    }

}
