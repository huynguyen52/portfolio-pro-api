package com.portfolio_pro.portfolio_pro_api.service;

import com.portfolio_pro.portfolio_pro_api.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BlogService {

    Page<Blog> findAllBlogs(Pageable pageable);

    Blog findBlogById(Long id);

    Blog createBlog(Blog blog);

    void deleteBlog(Long id);
}
