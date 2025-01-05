package com.portfolio_pro.portfolio_pro_api.service;

import com.portfolio_pro.portfolio_pro_api.entity.Skill;

import java.util.List;

public interface SkillService {

    public List<Skill> findAll();

    public Skill createSkill(Skill skill);

    public void deleteSkill(Long id);

    public void deleteSkills(List<Long> ids);
}
