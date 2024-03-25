package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    ArrayList < CustomerDTO> arrayList = new ArrayList<>();

    @Override
    public ArrayList<CustomerDTO> getAllCustoemr() {
        return arrayList;
    }

    @Override
    public CustomerDTO getCustomerDetails(String id) {

        CustomerDTO dto = null;

        for (int i = 0  ; i< arrayList.size() ; i++ ){

            if(arrayList.get(i).getId().equals(id)){
                dto = arrayList.get(i);
            }
        }

        return dto;
    }

    @Override
    public void saveCustomer(CustomerDTO customerDTO) {

        arrayList.add(customerDTO);

    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO) {

        for (int i = 0  ; i< arrayList.size() ; i++ ){

            if(arrayList.get(i).getId() == customerDTO.getId()){
               arrayList.set(i,customerDTO);
            }
        }

    }

    @Override
    public void deleteCustomer(String id) {

        for (int i = 0  ; i< arrayList.size() ; i++ ){

            if(arrayList.get(i).getId().equals(id)){
                arrayList.remove(i);
            }
        }

    }
}
