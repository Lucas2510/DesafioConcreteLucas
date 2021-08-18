package accenture.desafioconcrete.service;

import accenture.desafioconcrete.entity.Categories;
import accenture.desafioconcrete.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriesServiceImp implements CategoriesService {
    @Autowired
    private CategoriesRepository categoriesRepository;

    public Categories getCategories(){
        return categoriesRepository.getCategories();
    }
}