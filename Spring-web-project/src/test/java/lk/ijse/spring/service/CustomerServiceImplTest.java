package lk.ijse.spring.service;

import jakarta.transaction.Transactional;
import lk.ijse.spring.config.WebRootConfig;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.exception.NotFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import lk.ijse.spring.service.CustomerService;


import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(classes = WebRootConfig.class)
@Transactional
class CustomerServiceImplTest {

    @Autowired
    CustomerService customerService;

    @Test
    void getAllCustoemr() {
        assertDoesNotThrow(()->customerService.getAllCustoemr());
    }

    @Test
    void getCustomerDetails() {
        //        CustomerDTO dto = customerService.saveCustomer(new CustomerDTO("C001", "Kaml", "Galle", "pic1"));
//        assertDoesNotThrow(()->
//                customerService.getCustomerDetails(dto.getId()));

        assertThrows(NotFoundException.class, ()->
                customerService.getCustomerDetails("Coo1"));
    }

    @Test
    void saveCustomer() {

        CustomerDTO dto = new CustomerDTO("C001", "Kaml", "Galle", "pic1");
        CustomerDTO dto1 = customerService.saveCustomer(dto);
        assertNotEquals(null,dto1);
    }

    @Test
    void updateCustomer() {
        CustomerDTO dto = new CustomerDTO("C001", "Kaml", "Galle", "pic1");
        CustomerDTO dto1 = customerService.saveCustomer(dto);
        assertNotEquals(null,dto1);
    }

    @Test
    void deleteCustomer() {

    }
}