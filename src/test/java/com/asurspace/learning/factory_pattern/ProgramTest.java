package com.asurspace.learning.factory_pattern;

import com.asurspace.learning.factory_pattern.factory_pattern.Developer;
import com.asurspace.learning.factory_pattern.factory_pattern.Program;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest extends Assert {

    @Test
    public void method(){
        Developer javaDeveloper = Program.createDeveloper("java");
        String expected = "Write Java code..";
        assertEquals(expected, javaDeveloper.writeCode());
    }
}