package com.asurspace.learning.factory_pattern.abstract_factory_pattern.website;

import com.asurspace.learning.factory_pattern.abstract_factory_pattern.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php dev write php code");
    }
}
