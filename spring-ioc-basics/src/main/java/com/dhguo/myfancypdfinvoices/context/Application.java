package com.dhguo.myfancypdfinvoices.context;

import com.dhguo.myfancypdfinvoices.service.InvoiceService;
import com.dhguo.myfancypdfinvoices.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Application {
    public static final UserService userService = new UserService();
    public static final InvoiceService invoiceService = new InvoiceService(userService);
    public static final ObjectMapper objectMapper = new ObjectMapper();
}