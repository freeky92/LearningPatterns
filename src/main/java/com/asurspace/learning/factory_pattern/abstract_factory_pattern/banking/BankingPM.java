package com.asurspace.learning.factory_pattern.abstract_factory_pattern.banking;

import com.asurspace.learning.factory_pattern.abstract_factory_pattern.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project..");
    }
}
