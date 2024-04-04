package lk.ijse.spring.repositories;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer,String> {

    List<Customer> findCustomerByName(String name);

    Customer findCustomerByNameAndAddress(String name,String address);

    int countCustomerByAddressStartsWith(String [] letters);

    @Query(value = "select * from customers",nativeQuery = true)
    List<Customer> getAllCustomer();

    @Query(value = "select * from customers where name=?1 and address=?2",nativeQuery = true)
    List<Customer> getCustomerByNameAndAddress(String name , String address);

    @Query(value = "select * from customers where name= :name and address= :address",nativeQuery = true)
    List<Customer> getCustomerByNameAndAddress2(@Param("name")String name , @Param("address")String address);

}
