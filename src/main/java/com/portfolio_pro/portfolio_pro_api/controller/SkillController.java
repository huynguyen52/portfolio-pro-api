package com.portfolio_pro.portfolio_pro_api.controller;

import com.portfolio_pro.portfolio_pro_api.entity.Skill;
import com.portfolio_pro.portfolio_pro_api.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @GetMapping
    List<Skill> getSkills() {
        return skillService.findAll();
    }

    @PostMapping
    Skill createSkill(@RequestBody Skill skill) {
        return skillService.createSkill(skill);
    }

    @DeleteMapping("/{skillId}")
    void deleteSkill(@PathVariable("skillId") Long id) {
        skillService.deleteSkill(id);
    }

    @DeleteMapping
    void deleteSkills(@RequestBody List<Long> ids) {
        skillService.deleteSkills(ids);
    }
}
