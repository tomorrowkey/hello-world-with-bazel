package com.example.lib.model;

public class Person {

  private String name;

  public Person() {
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void greet() {
    System.out.println("Hi! I am " + getName());
  }
}