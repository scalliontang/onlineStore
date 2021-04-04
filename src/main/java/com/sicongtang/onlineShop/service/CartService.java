package com.sicongtang.onlineShop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sicongtang.onlineShop.dao.CartDao;
import com.sicongtang.onlineShop.entity.Cart;

@Service
public class CartService {

    @Autowired
    private CartDao cartDao;

    public Cart getCartById(int cartId) {
        return cartDao.getCartById(cartId);
    }
}

