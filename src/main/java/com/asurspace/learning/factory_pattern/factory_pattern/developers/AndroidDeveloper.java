package com.asurspace.learning.factory_pattern.factory_pattern.developers;

import com.asurspace.learning.factory_pattern.factory_pattern.Developer;

public class AndroidDeveloper implements Developer {
    @Override
    public String writeCode() {
        return "Write XML & Java code..";
    }
}
