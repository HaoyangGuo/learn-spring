package com.dhguo.myfancypdfinvoices.context;

import com.dhguo.myfancypdfinvoices.ApplicationLauncher;
import com.dhguo.myfancypdfinvoices.service.InvoiceService;
import com.dhguo.myfancypdfinvoices.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackageClasses = ApplicationLauncher.class)
public class MyFancyPdfInvoicesApplicationConfiguration {

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
