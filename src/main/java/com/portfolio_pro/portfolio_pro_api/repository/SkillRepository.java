package com.portfolio_pro.portfolio_pro_api.repository;

import com.portfolio_pro.portfolio_pro_api.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
}
