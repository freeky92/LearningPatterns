package com.asurspace.learning.factory_pattern.abstract_factory_pattern.banking;

import com.asurspace.learning.factory_pattern.abstract_factory_pattern.Developer;
import com.asurspace.learning.factory_pattern.abstract_factory_pattern.ProjectManager;
import com.asurspace.learning.factory_pattern.abstract_factory_pattern.ProjectTeamFactory;
import com.asurspace.learning.factory_pattern.abstract_factory_pattern.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
