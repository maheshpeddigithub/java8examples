package com.ssil.java8.interfacemethods.duplicate;

public interface MyInterface2 {
    default int getVal() {
        return 2;
    }

    void display1();
}
