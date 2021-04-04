package com.sicongtang.onlineShop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sicongtang.onlineShop.dao.SalesOrderDao;
import com.sicongtang.onlineShop.entity.SalesOrder;

@Service
public class SalesOrderService {

    @Autowired
    private SalesOrderDao salesOrderDao;

    public void addSalesOrder(SalesOrder salesOrder) {
        salesOrderDao.addSalesOrder(salesOrder);
    }
}

