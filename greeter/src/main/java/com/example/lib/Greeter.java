package com.example.lib;

import com.example.lib.model.Person;

public class Greeter {
    public void greet() {
        Person p = new Person();
        p.setName("Taro");
        p.greet();
    }
}
