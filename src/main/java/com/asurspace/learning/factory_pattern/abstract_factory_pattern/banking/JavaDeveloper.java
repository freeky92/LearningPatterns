package com.asurspace.learning.factory_pattern.abstract_factory_pattern.banking;

import com.asurspace.learning.factory_pattern.abstract_factory_pattern.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java dev write java code.");
    }
}
