package com.portfolio_pro.portfolio_pro_api.service.impl;

import com.portfolio_pro.portfolio_pro_api.entity.Skill;
import com.portfolio_pro.portfolio_pro_api.repository.SkillRepository;
import com.portfolio_pro.portfolio_pro_api.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {
    @Autowired
    private SkillRepository skillRepository;

    @Override
    public List<Skill> findAll() {
        return skillRepository.findAll();
    }

    @Override
    public Skill createSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        skillRepository.deleteById(id);
    }

    @Override
    public void deleteSkills(List<Long> ids) {
        for (Long id : ids) {
            skillRepository.deleteById(id);
        }
    }
}
