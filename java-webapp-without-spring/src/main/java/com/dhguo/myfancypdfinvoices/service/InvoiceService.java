package com.dhguo.myfancypdfinvoices.service;

import com.dhguo.myfancypdfinvoices.model.Invoice;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InvoiceService {
    List<Invoice> invoices = new CopyOnWriteArrayList<>();

    public List<Invoice> findAll() {
        return invoices;
    }
    public Invoice create(String userId, Integer amount) {
        // TODO real pdf creation and storing it on network server
        Invoice invoice = new Invoice(userId, "http://www.africau.edu/images/default/sample.pdf",  amount);
        invoices.add(invoice);
        return invoice;
    }
}
