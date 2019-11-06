package org.ogk.tmall.service;

import org.ogk.tmall.pojo.Category;
import org.ogk.tmall.util.Page;

import java.util.List;

public interface CategoryService {
    int total();
    List<Category> list(Page page);
    void add(Category category);
}
