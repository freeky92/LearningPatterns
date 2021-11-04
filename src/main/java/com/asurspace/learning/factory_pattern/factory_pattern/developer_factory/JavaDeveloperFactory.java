package com.asurspace.learning.factory_pattern.factory_pattern.developer_factory;

import com.asurspace.learning.factory_pattern.factory_pattern.Developer;
import com.asurspace.learning.factory_pattern.factory_pattern.DeveloperFactory;
import com.asurspace.learning.factory_pattern.factory_pattern.developers.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDevelopers() {
        return new JavaDeveloper();
    }
}
