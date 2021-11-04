package com.asurspace.learning.factory_pattern.abstract_factory_pattern;

public interface ProjectTeamFactory {

    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
