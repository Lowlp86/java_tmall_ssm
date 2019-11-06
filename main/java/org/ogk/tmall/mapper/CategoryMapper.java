package org.ogk.tmall.mapper;

import org.ogk.tmall.pojo.Category;
import org.ogk.tmall.util.Page;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryMapper {
    public List<Category> list(Page page);

    public int total();

    public void add(Category category);
}
