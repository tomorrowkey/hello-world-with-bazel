package com.example;

import com.example.lib.Greeter;

public class ProjectRunner {
    public static void main(String args[]) {
        new Greeter().greet();

        System.out.println("env=" + Environment.getEnvironment());
    }
}
