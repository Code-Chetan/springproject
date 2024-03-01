package org.springproject.aop1;

import org.springframework.stereotype.Component;

@Component
public class PaymentServiceImpl implements PaymentService{
    @Override
    public void makePayment() {
        System.out.println("Amount debited");
        //
        //
        //
        //
        System.out.println("Amount credited");
    }
}
