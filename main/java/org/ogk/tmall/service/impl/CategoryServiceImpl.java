package org.ogk.tmall.service.impl;

import org.ogk.tmall.mapper.CategoryMapper;
import org.ogk.tmall.pojo.Category;
import org.ogk.tmall.service.CategoryService;
import org.ogk.tmall.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public List<Category> list(Page page) {
        return categoryMapper.list(page);
    }

    @Override
    public int total() {
        return categoryMapper.total();
    }

    @Override
    public void add(Category category) {
        categoryMapper.add(category);
    }
}
