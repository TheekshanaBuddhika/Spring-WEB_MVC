package lk.ijse.spring.service;


import lk.ijse.spring.dto.CustomerDTO;

import lk.ijse.spring.repositories.CustomerRepo;
import lk.ijse.spring.service.exception.NotFoundException;
import lk.ijse.spring.service.util.Transformer;
import lk.ijse.spring.service.util.UtilMatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    Transformer transformer;

    @Override
    public List<CustomerDTO> getAllCustoemr() {

        return customerRepo.findAll().stream()
                .map(customer -> transformer.fromCustomerEntity(customer))
                .toList();

    }

    @Override
    public CustomerDTO getCustomerDetails(String id) {
       if(!customerRepo.existsById(id)) {
          throw  new NotFoundException("Customer id : "+id+" does not exsists");
       }

        return transformer.fromCustomerEntity(customerRepo.findById(id).get());

    }

    @Override
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
            customerDTO.setId(UtilMatter.generateId());
         return transformer.fromCustomerEntity(customerRepo.save(transformer.toCustomerEntity(customerDTO)));

    }


    @Override
    public void updateCustomer(CustomerDTO customerDTO) {
        if(!customerRepo.existsById(customerDTO.getId())) {
            throw  new NotFoundException("Customer id : "+customerDTO.getId()+" does not exsists");
        }
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
