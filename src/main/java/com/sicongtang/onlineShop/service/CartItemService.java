package com.sicongtang.onlineShop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sicongtang.onlineShop.dao.CartItemDao;
import com.sicongtang.onlineShop.entity.Cart;
import com.sicongtang.onlineShop.entity.CartItem;

@Service
public class CartItemService {

    @Autowired
    private CartItemDao cartItemDao;

    public void addCartItem(CartItem cartItem) {
        cartItemDao.addCartItem(cartItem);

    }

    public void removeCartItem(int cartItemId) {
        cartItemDao.removeCartItem(cartItemId);
    }

    public void removeAllCartItems(Cart cart) {
        cartItemDao.removeAllCartItems(cart);
    }
}

