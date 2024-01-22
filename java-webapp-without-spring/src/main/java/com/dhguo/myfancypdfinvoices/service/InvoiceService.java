package com.dhguo.myfancypdfinvoices.service;

import com.dhguo.myfancypdfinvoices.context.Application;
import com.dhguo.myfancypdfinvoices.model.Invoice;
import com.dhguo.myfancypdfinvoices.model.User;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InvoiceService {

    private final UserService userService;

    List<Invoice> invoices = new CopyOnWriteArrayList<>();

    public InvoiceService(UserService userService) {
        this.userService = userService;
    }

    public List<Invoice> findAll() {
        return invoices;
    }

    public Invoice create(String userId, Integer amount) {
        User user = userService.findById(userId);
        if (user == null) {
            throw new IllegalArgumentException("User not found");
        }

        // TODO real pdf creation and storing it on network server
        Invoice invoice = new Invoice(userId, "http://www.africau.edu/images/default/sample.pdf", amount);
        invoices.add(invoice);
        return invoice;
    }
}
