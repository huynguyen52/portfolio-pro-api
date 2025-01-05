package com.portfolio_pro.portfolio_pro_api.service.impl;

import com.portfolio_pro.portfolio_pro_api.entity.Blog;
import com.portfolio_pro.portfolio_pro_api.repository.BlogRepository;
import com.portfolio_pro.portfolio_pro_api.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Page<Blog> findAllBlogs(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Blog findBlogById(Long id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public Blog createBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public void deleteBlog(Long id) {
        blogRepository.deleteById(id);
    }

    @Override
    public void deleteBlogs(List<Long> ids) {
        for (Long id : ids) {
            blogRepository.deleteById(id);
        }
    }
}
