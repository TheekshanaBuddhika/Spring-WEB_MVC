package lk.ijse.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @GetMapping(params = "id")
    public String getsup(String id){
        return String.format("supplier %s",id);
    }

    @GetMapping("/test")
    public String getsup2(@RequestParam("name") String name) {
        return String.format("supplier2 %s", name);
    }

    @GetMapping("/all")
    public String getsupall(@RequestParam("name") String name, @RequestParam("id") String id) {
        return String.format("supplier2  name : %s \n id : %s ", name, id);
    }

        @GetMapping(params = {"id","name","age"})
        public String getsupall(String id,String name,String age){
            return String.format("supplier2  name : %s \n id : %s \n age : %s",name,id,age);
    }

}
