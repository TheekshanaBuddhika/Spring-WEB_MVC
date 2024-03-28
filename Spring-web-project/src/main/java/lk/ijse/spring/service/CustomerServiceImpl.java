package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repositories.CustomerRepo;
import lk.ijse.spring.service.util.Transformer;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    Transformer transformer;

    @Override
    public ArrayList<CustomerDTO> getAllCustoemr() {

        return transformer.fromEntityList(customerRepo.findAll());
    }

    @Override
    public CustomerDTO getCustomerDetails(String id) {

        return transformer.fromCustomerEntity( customerRepo.findById(id));

    }

    @Override
    public void saveCustomer(CustomerDTO customerDTO) {

         customerRepo.save(transformer.toCustomerEntity(customerDTO));

    }


    @Override
    public void updateCustomer(CustomerDTO customerDTO) {

         customerRepo.save(transformer.toCustomerEntity(customerDTO));

    }

    @Override
    public void deleteCustomer(String id) {

//        for (int i = 0  ; i< arrayList.size() ; i++ ){
//
//            if(arrayList.get(i).getId().equals(id)){
//                arrayList.remove(i);
//            }
//        }

    }
}
