package com.example.lib;

import com.example.lib.model.Person;
import com.example.lib.model.PersonBuilder;

public class Greeter {
    public void greet() {
        Person p = new PersonBuilder()
          .withName("Taro")
          .build();
        p.greet();
    }
}
