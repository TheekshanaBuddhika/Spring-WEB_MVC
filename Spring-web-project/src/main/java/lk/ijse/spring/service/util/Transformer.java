package lk.ijse.spring.service.util;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class Transformer {

    @Autowired
    ModelMapper mapper;

    public CustomerDTO fromCustomerEntity(Optional<Customer> customer){
        return  mapper.map(customer, CustomerDTO.class);

    }

    public Customer toCustomerEntity(CustomerDTO customerDTO){
        return mapper.map(customerDTO,Customer.class);
    }

    public ArrayList<CustomerDTO> fromEntityList(List customer){

        ArrayList <CustomerDTO> list= new ArrayList<>();

        for (int i=0; i<customer.size();i++){
           list.add(mapper.map(customer,CustomerDTO.class));
        }

        return list;
    }

}
