package lk.ijse.spring.advice;

import lk.ijse.spring.service.exception.DuplicateRecordException;
import lk.ijse.spring.service.exception.NotFoundException;
import lk.ijse.spring.service.exception.ServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.LinkedHashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ServiceException.class)
    public ResponseEntity<Map<String,Object>> handleServiceException(ServiceException serviceException) {

        Map<String, Object> errorAttribute;
        if(serviceException instanceof DuplicateRecordException){
            errorAttribute = getCommonErrorAttribute(HttpStatus.CONFLICT);
        }else if(serviceException instanceof NotFoundException){
            errorAttribute = getCommonErrorAttribute(HttpStatus.NOT_FOUND);
        }else{
            errorAttribute = getCommonErrorAttribute(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        errorAttribute.put("message",serviceException.getMessage());

        return new ResponseEntity<>(errorAttribute,HttpStatus.valueOf((Integer) errorAttribute.get("code")));
    }

    public Map<String,Object> getCommonErrorAttribute(HttpStatus httpStatus){
        LinkedHashMap<String,Object> errorAttributes = new LinkedHashMap<>();
        errorAttributes.put("code",httpStatus.value());
        errorAttributes.put("status",httpStatus);
        return errorAttributes;
    }

}
