package com.unittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailServiceTest {
    EmailService emailService = EmailService.getInstance();
    Order order = new Order(5,"Headphones",2000.50);
    @Test
    void testGetInstance() {
        EmailService emailService1 = EmailService.getInstance();
        assertTrue(emailService1.equals(emailService));
    }

    @Test
    void sendEmail() {
        Assertions.assertThrows(RuntimeException.class,
                ()->emailService.sendEmail(new Order()));
    }

    @Test
    void testSendEmail() {
        String s="Order dispatched";
        assertTrue(EmailService.getInstance().sendEmail(order,s));
    }
}