package com.asurspace.learning.factory_pattern.factory_pattern.developers;

import com.asurspace.learning.factory_pattern.factory_pattern.Developer;

public class CppDeveloper implements Developer {
    @Override
    public String writeCode() {
        return "Write Cpp code..";
    }
}
