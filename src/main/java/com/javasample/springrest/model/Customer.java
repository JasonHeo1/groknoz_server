package com.javasample.springrest.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private  int age;

    @Column(name = "active")
    private boolean active;

    public Customer(){

    }

    public Customer(String name, int age){
        this.name = name;
        this.age = age;
        this.active = false;
    }

    @Override
    public String toString(){
        return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", active=" + active + "]";
    }

}
