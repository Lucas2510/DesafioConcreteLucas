package accenture.desafioconcrete.controller;

import accenture.desafioconcrete.entity.Categories;
import accenture.desafioconcrete.entity.Coupons;
import accenture.desafioconcrete.service.CategoriesService;
import accenture.desafioconcrete.service.CouponsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CategoriesController {
    @Autowired
    private CategoriesService categoriesService;

    @GetMapping("/categories")
    public Categories CategoriesDTO() {
            return categoriesService.getCategories();
        }
    }
