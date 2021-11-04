package com.asurspace.learning.factory_pattern.abstract_factory_pattern.website;

import com.asurspace.learning.factory_pattern.abstract_factory_pattern.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("ManualTester test code...");
    }
}
