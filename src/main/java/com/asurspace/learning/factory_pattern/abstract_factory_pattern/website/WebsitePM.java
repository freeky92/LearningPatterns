package com.asurspace.learning.factory_pattern.abstract_factory_pattern.website;

import com.asurspace.learning.factory_pattern.abstract_factory_pattern.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("WebsitePM manages website projects...");
    }
}
