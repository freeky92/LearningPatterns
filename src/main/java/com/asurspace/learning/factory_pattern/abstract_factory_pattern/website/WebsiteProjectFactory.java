package com.asurspace.learning.factory_pattern.abstract_factory_pattern.website;

import com.asurspace.learning.factory_pattern.abstract_factory_pattern.Developer;
import com.asurspace.learning.factory_pattern.abstract_factory_pattern.ProjectManager;
import com.asurspace.learning.factory_pattern.abstract_factory_pattern.ProjectTeamFactory;
import com.asurspace.learning.factory_pattern.abstract_factory_pattern.Tester;

public class WebsiteProjectFactory implements ProjectTeamFactory {


    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
