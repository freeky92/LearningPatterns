package com.asurspace.learning.factory_pattern.factory_pattern;

import com.asurspace.learning.factory_pattern.factory_pattern.developer_factory.AndroidDeveloperFactory;
import com.asurspace.learning.factory_pattern.factory_pattern.developer_factory.CppDeveloperFactory;
import com.asurspace.learning.factory_pattern.factory_pattern.developer_factory.JavaDeveloperFactory;
import com.asurspace.learning.factory_pattern.factory_pattern.developer_factory.JavaScriptDeveloperFactory;

/**
 * Factory pattern
 */
public class Program {
    public static void main(String[] args) {
        Developer androidDev = createDeveloper("android");
        Developer javaDev = createDeveloper("java");

        System.out.println(javaDev.writeCode());
    }

    public static Developer createDeveloper(String speciality) {
        return switch (speciality.toLowerCase()) {
            case ("android") -> new AndroidDeveloperFactory().createDevelopers();
            case ("java") -> new JavaDeveloperFactory().createDevelopers();
            case ("cpp") -> new CppDeveloperFactory().createDevelopers();
            case ("javascript") -> new JavaScriptDeveloperFactory().createDevelopers();
            default -> throw new RuntimeException("Speciality name expected");
        };
    }
}
