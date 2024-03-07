package lk.ijse.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/map")
public class MappingSpecController {
/*

    @GetMapping
    public String getmethod(){
        return "getMethod()";
    }

    @GetMapping("/sec")
    public String getmethod2(){
        return "1234";
    }

   // @GetMapping("/sec/nex?")
  //  @GetMapping("/sec/nex???")
   @GetMapping("/sec/n?x")
    public String getmethod3(){
        return "123456";
    }

*/

//   // @GetMapping("/sec/*")
//   @GetMapping("/sec/*/*")
//    public String getmethod4(){
//        return "123456123356788";
//    }



    @GetMapping("/sec*")
    public String getmethod5(){
        return "123456123356788";
    }

    @GetMapping("/sec*/*.php")
    public String getmethod6(){
        return "123456123356788";
    }

}
