package com.example.Employee.Service;

import com.example.Employee.Exception.ResourceNotFoundException;
import com.example.Employee.Model.Address;

import com.example.Employee.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address addAddress(Address address) {
        return addressRepository.save(address);
    }

    public Address updateAddress(Long id, Address addressDetails) {
        Address address = addressRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Address not found with id: " + id));

        address.setAddress(addressDetails.getAddress());

        return addressRepository.save(address);
    }

    public void deleteAddress(Long id) {
        Address address = addressRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Address not found with id: " + id));

        addressRepository.delete(address);
    }

    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }
}
