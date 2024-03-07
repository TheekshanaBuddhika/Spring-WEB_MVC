package lk.ijse.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String SaveitemJson(){
        return "SaveitemJson() : i only accept application/json";
    }

    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    public String SaveitemXMl(){
        return "SaveitemJson() : i only accept application/xml";
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String SaveitemMultipartformData(){
        return "SaveitemJson() : i only accept multipart formdata vlue";
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String GetitemJson(){
        return  "getitemAsJson";
    }

    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public String GetItem(){
        return "getItem()";
    }


}
