package com.portfolio_pro.portfolio_pro_api.controller;

import com.portfolio_pro.portfolio_pro_api.entity.Blog;
import com.portfolio_pro.portfolio_pro_api.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@RestController
@RequestMapping(value = "/blogs")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping
    public List<Blog> findAllBlogs(
            @RequestParam(value = "pageNumber", defaultValue = "0") int pageNumber,
            @RequestParam(value = "pageSize", defaultValue = "20") int pageSize,
            @RequestParam(value = "sortBy", defaultValue = "id") String sortBy,
            @RequestParam(value = "sortOrder", defaultValue = "ASC") String sortOrder
    ) {
        Sort.Direction direction = sortOrder.equalsIgnoreCase("asc") ? Sort.Direction.ASC : Sort.Direction.DESC;
        Sort sort = Sort.by(direction, sortBy);
        Pageable pageable = PageRequest.of(pageNumber, pageSize, sort);
        return blogService.findAllBlogs(pageable).getContent();
    }

    @PostMapping
    public Blog createBlog(@RequestBody Blog blog) {
        return blogService.createBlog(blog);
    }

    @GetMapping("/{blogId}")
    public Blog findBlogById(@PathVariable("blogId") Long blogId) {
        return blogService.findBlogById(blogId);
    }

    @DeleteMapping("/{blogId}")
    public void deleteBlogById(@PathVariable("blogId") Long blogId) {
        blogService.deleteBlog(blogId);
    }

    @DeleteMapping
    public void deleteAllBlogs(@RequestBody List<Long> ids) {
        blogService.deleteBlogs(ids);
    }
}
