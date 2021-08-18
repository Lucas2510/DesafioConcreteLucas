package accenture.desafioconcrete.dto;

import accenture.desafioconcrete.entity.Categories;
import accenture.desafioconcrete.entity.Subcategory2;
import accenture.desafioconcrete.entity.Subcategory3;
import accenture.desafioconcrete.entity.Subcategory4;
import accenture.desafioconcrete.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;



public class CategoriesDTO {
    @Autowired
    private CategoriesService categoriesService;

    @RequestMapping( "/categories/dto")
    public Map<String,Object> CategoriesDTO(Categories categories, Subcategory2 subcategory2, Subcategory3 subcategory3, Subcategory4 subcategory4){
        Map<String, Object> dto = new LinkedHashMap<>();
        dto.put("id",categories.getId());
        dto.put("name", categories.getName());
        dto.put("relevance", categories.getRelevance());
        dto.put("id", subcategory2.getId());
        dto.put("name", subcategory2.getName());
        dto.put("relevance", subcategory2.getRelevance());
        dto.put("id", subcategory3.getId());
        dto.put("name", subcategory3.getName());
        dto.put("relevance", subcategory3.getRelevance());
        dto.put("smallImageUrl", subcategory3.getSmallImageUrl());
        dto.put("id", subcategory4.getId());
        dto.put("name", subcategory4.getName());
        dto.put("relevance", subcategory4.getRelevance());
        return dto;
    }
/*
    public Categories CategoriesOrder(Categories categories) {
        List<Categories> categoriesTop5 = new ArrayList<>();
        List<Categories> categoriesNoTop5 = new ArrayList<>();
        List<Map<String, Object>> showTop5 = new ArrayList<>();
        List<Map<String, Object>> showNoTop5 = new ArrayList<>();

        for (int i = 0; i < categoriesService.getCategories().getRelevance(); i++) {
                if (categoriesTop5.size()<6  ){
                        categoriesTop5.add(categories);
                }else{
                    categoriesNoTop5.add(categories);
                }


        }
        return showNoTop5,showTop5;
    }*/

}

