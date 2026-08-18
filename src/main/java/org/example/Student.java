package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Student {
    @Id
    private int id;
    private String name;
    private double marks;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public Student(){

    }
    public Student(int id, String name, double marks) {
        super();
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "org.example.Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }

}
