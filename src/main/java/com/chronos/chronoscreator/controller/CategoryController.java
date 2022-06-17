package com.chronos.chronoscreator.controller;

import com.chronos.chronoscreator.entity.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {

    @GetMapping
    public ResponseEntity<List<Category>> findAllCategories() {
        Category category = new Category();
        category.setId(UUID.randomUUID());
        ResponseEntity<List<Category>> categorias = ResponseEntity.ok(Arrays.asList(category));
        return categorias;
    }
}
