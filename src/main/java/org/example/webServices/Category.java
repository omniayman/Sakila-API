package org.example.webServices;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.dtos.category.CategoryDto;
import org.example.dtos.film.FilmDto;
import org.example.presistance.exceptionHandler.InvalidDataException;
import org.example.services.CategoryService;

import java.util.List;

@WebService
public class Category {
    CategoryService categoryService = new CategoryService();

    @WebMethod
    public List<CategoryDto> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @WebMethod
    public CategoryDto getCategoryById(@WebParam(name = "id") int id) {
        return categoryService.getCategoryById(id);
    }

    @WebMethod
    public void updateCategory(@WebParam(name = "category") CategoryDto categoryDto) {

        categoryService.updateCategory(categoryDto);
    }

    @WebMethod
    public void addCategory(@WebParam(name = "category") CategoryDto categoryDto) throws InvalidDataException {
        categoryService.addCategory(categoryDto);
    }

    @WebMethod
    public List<FilmDto> getFilmsByCategoryId(@WebParam(name = "id") int id) {

        return categoryService.getFilmsByCategoryId(id);

    }

    @WebMethod
    public List<CategoryDto> getCategoryByName(@WebParam(name = "name") String name) {

        return categoryService.getCategoriesByName(name);
    }

    @WebMethod
    public long getFilmsCountInCategory(@WebParam(name = "id") int id) {
        return categoryService.getFilmsInCategory(id);
    }
}
