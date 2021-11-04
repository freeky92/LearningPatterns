package com.asurspace.learning.factory_pattern.abstract_factory_pattern;

import com.asurspace.learning.factory_pattern.abstract_factory_pattern.website.WebsiteProjectFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        WebsiteProjectFactory wpt = new WebsiteProjectFactory();
        Developer d2 = wpt.getDeveloper();
        Tester t2 = wpt.getTester();
        ProjectManager p2 = wpt.getProjectManager();

        System.out.println();

        d2.writeCode();
        t2.testCode();
        p2.manageProject();
    }
}
