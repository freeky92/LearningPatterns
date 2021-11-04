package com.asurspace.learning.factory_pattern.factory_pattern.developers;

import com.asurspace.learning.factory_pattern.factory_pattern.Developer;

public class JavaDeveloper implements Developer{
    @Override
    public String writeCode() {
        return "Write Java code..";
    }
}
