package lk.ijse.spring.repositories;

import lk.ijse.spring.config.WebAppConfig;
import lk.ijse.spring.config.WebRootConfig;
import lk.ijse.spring.entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;
import lk.ijse.spring.repositories.CustomerRepo;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Transactional
@SpringJUnitConfig(classes = WebRootConfig.class)
class CustomerRepoTest {

    @Autowired
    CustomerRepo customerRepo;

    void addallcustomers (){

        customerRepo.save(new Customer("coo1","kaml","galle","pic1"));
        customerRepo.save(new Customer("coo2","kaml","galle","pic1"));
        customerRepo.save(new Customer("coo3","kaml","galle","pic1"));
    }

    @Test
    void findCustomerByName() {
        addallcustomers();
        List<Customer> kaml = customerRepo.findCustomerByName("kaml");
    }
}