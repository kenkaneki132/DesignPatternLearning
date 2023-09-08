package com.design.pattern;

import com.design.creational.SingletonPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        
        final SingletonPattern singletonPattern = SingletonPattern.getInstance();
        
        if(singletonPattern==null) {
        	System.out.println("object not created");
        }
        else {
        	System.out.println("Onject created");
        }
    }
}