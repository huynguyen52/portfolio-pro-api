package com.portfolio_pro.portfolio_pro_api.repository;

import com.portfolio_pro.portfolio_pro_api.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {
}
