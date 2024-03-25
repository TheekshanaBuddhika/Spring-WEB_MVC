package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;

import java.util.ArrayList;
import java.util.List;

public interface CustomerService {

    ArrayList<CustomerDTO> getAllCustoemr();

    CustomerDTO getCustomerDetails(String id);

    void saveCustomer(CustomerDTO customerDTO);

    void updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(String id);

}
