package com.example.thuchanh.service;

import com.example.thuchanh.model.Category;
import com.example.thuchanh.repository.CategoryRepository;
import com.example.thuchanh.repository.ICategoryRepository;

import java.util.List;

public class CategoryService implements ICategoryService {
    ICategoryRepository iCategoryRepository = new CategoryRepository();
    @Override
    public List<Category> displayCategory() {
        return iCategoryRepository.displayCategory();
    }
}
