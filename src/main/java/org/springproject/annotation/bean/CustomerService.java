package org.springproject.annotation.bean;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private int customerServiceId;
    private String customerServiceName;

    public CustomerService() {
    }

    public CustomerService(int customerServiceId, String customerServiceName) {
        this.customerServiceId = customerServiceId;
        this.customerServiceName = customerServiceName;
    }

    public int getCustomerServiceId() {
        return customerServiceId;
    }

    public void setCustomerServiceId(int customerServiceId) {
        this.customerServiceId = customerServiceId;
    }

    public String getCustomerServiceName() {
        return customerServiceName;
    }

    public void setCustomerServiceName(String customerServiceName) {
        this.customerServiceName = customerServiceName;
    }

    @Override
    public String toString() {
        return "CustomerService{" +
                "customerServiceId=" + customerServiceId +
                ", customerServiceName='" + customerServiceName + '\'' +
                '}';
    }
}
