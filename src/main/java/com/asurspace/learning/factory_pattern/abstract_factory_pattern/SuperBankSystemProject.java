package com.asurspace.learning.factory_pattern.abstract_factory_pattern;

import com.asurspace.learning.factory_pattern.abstract_factory_pattern.banking.BankingTeamFactory;

public class SuperBankSystemProject {
    public static void main(String[] args) {
        ProjectTeamFactory pf = new BankingTeamFactory();
        Developer d1 = pf.getDeveloper();
        Tester t1 = pf.getTester();
        ProjectManager p1 = pf.getProjectManager();

        System.out.println();
        d1.writeCode();
        t1.testCode();
        p1.manageProject();
    }
}
