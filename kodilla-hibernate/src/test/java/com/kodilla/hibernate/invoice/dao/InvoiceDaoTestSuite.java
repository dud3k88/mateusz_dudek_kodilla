package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest

public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        Product rice = new Product("Rice");
        Product bananas = new Product("Bananas");
        Product pineapple = new Product("Pineapple");

        Invoice invoice = new Invoice("01");
        Invoice invoice2 = new Invoice("02");
        Invoice invoice3 = new Invoice("03");

        Item item = new Item(rice, new BigDecimal(10), 3, new BigDecimal(1000), invoice);
        Item item2 = new Item(bananas, new BigDecimal(10), 3, new BigDecimal(1000), invoice2);
        Item item3 = new Item(pineapple, new BigDecimal(10), 3, new BigDecimal(1000), invoice3);

        itemDao.save(item);
        itemDao.save(item2);
        itemDao.save(item3);

        int itemId = item.getId();
        int itemId2 = item2.getId();
        int itemId3 = item3.getId();

        Assert.assertNotEquals(0, itemId);
        Assert.assertNotEquals(0, itemId2);
        Assert.assertNotEquals(0, itemId3);

        itemDao.deleteAll();
    }
}
