package com.sicongtang.onlineShop.service;

import com.sicongtang.onlineShop.entity.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sicongtang.onlineShop.dao.CustomerDao;
import com.sicongtang.onlineShop.entity.Customer;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public void addCustomer(Customer customer) {
        customer.getUser().setEnabled(true);

        Cart cart = new Cart();
        customer.setCart(cart);

        customerDao.addCustomer(customer);
    }

    public Customer getCustomerByUserName(String userName) {
        return customerDao.getCustomerByUserName(userName);
    }
}

