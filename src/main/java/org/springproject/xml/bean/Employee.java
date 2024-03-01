package org.springproject.xml.bean;

public class Employee {
    private int empId;
    private String employeeName;

    public Employee() {
        this.empId=123;
        this.employeeName="Ramesh";
    }

    public void getEmployeeDetails(){
        System.out.println(this.empId);
        System.out.println(this.employeeName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }
}
