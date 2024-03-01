package org.springproject.annotation.bean;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {
    private int customer2Id;
    private String customer2Name;

    public CustomerRepository() {
    }

    public CustomerRepository(int customer2Id, String customer2Name) {
        this.customer2Id = customer2Id;
        this.customer2Name = customer2Name;
    }

    public int getCustomer2Id() {
        return customer2Id;
    }

    public void setCustomer2Id(int customer2Id) {
        this.customer2Id = customer2Id;
    }

    public String getCustomer2Name() {
        return customer2Name;
    }

    public void setCustomer2Name(String customer2Name) {
        this.customer2Name = customer2Name;
    }

    @Override
    public String toString() {
        return "CustomerRepository{" +
                "customer2Id=" + customer2Id +
                ", customer2Name='" + customer2Name + '\'' +
                '}';
    }
}
