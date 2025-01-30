package org.tms.pattern.decorator;

import org.tms.pattern.decorator.model.Developer;
import org.tms.pattern.decorator.model.JavaDeveloper;
import org.tms.pattern.decorator.model.ScalaDeveloper;
import org.tms.pattern.decorator.skill.DatabaseSkill;
import org.tms.pattern.decorator.skill.SpringSkill;
import org.tms.pattern.decorator.skill.TestSkill;

public class Main {
    public static void main(String[] args) {
        Developer javaDeveloper = new JavaDeveloper();
        TestSkill testSkill = new TestSkill(javaDeveloper);
        testSkill.showSkill();

        System.out.println();

        Developer scalaDeveloper = new ScalaDeveloper();

        SpringSkill sSkill = new SpringSkill(scalaDeveloper);
        DatabaseSkill dbSkill = new DatabaseSkill(sSkill);
        TestSkill tSkill = new TestSkill(dbSkill);

        tSkill.showSkill();
    }
}
