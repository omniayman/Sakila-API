package org.example.webServices;


import jakarta.jws.WebService;
import org.example.dtos.category.CategoryDto;
import org.example.dtos.film.FilmDto;
import org.example.services.CategoryService;

import java.util.List;

@WebService
public class Category {
    CategoryService categoryService = new CategoryService();

    public List<CategoryDto> getAllCategories() {
        return categoryService.getAllCategories();
    }

    public CategoryDto getCategoryById(int id) {
        return categoryService.getCategoryById(id);
    }

    public void updateCategory(CategoryDto categoryDto) {

        categoryService.updateCategory(categoryDto);
    }

    public void addCategory(CategoryDto categoryDto) {
        categoryService.addCategory(categoryDto);
    }

    public List<FilmDto> getFilmsByCategoryId(int id) {

        return categoryService.getFilmsByCategoryId(id);

    }

    public List<CategoryDto> getCategoryByName(String name) {

        return categoryService.getCategoriesByName(name);
    }

    public long getFilmsCountInCategory(int id) {
        return categoryService.getFilmsInCategory(id);
    }
}