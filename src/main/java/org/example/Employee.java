package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    private int empId;
    @Column(length = 20)
    private String empName;
    private double salary;
    private Address address;

    private Employee(){
        super();
    }

    public Employee(int empId, String empName, double salary, Address address) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return "org.example.Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}
