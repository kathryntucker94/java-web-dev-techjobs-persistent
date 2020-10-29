package org.launchcode.javawebdevtechjobspersistent.models.data.dto;

import org.launchcode.javawebdevtechjobspersistent.models.Employer;
import org.launchcode.javawebdevtechjobspersistent.models.Skill;

import javax.validation.constraints.NotNull;

public class JobSkillDTO {
    @NotNull
    private Skill skill;

    @NotNull
    private Employer employer;

    public JobSkillDTO() {
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
}
