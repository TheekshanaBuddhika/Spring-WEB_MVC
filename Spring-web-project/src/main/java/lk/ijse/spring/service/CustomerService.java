package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;

import java.util.ArrayList;

public interface CustomerService {

    ArrayList<CustomerDTO> getAllCustoemr();

    CustomerDTO getCustomerDetails(String id);

    CustomerDTO saveCustomer(CustomerDTO customerDTO);

    void updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(String id);

}
