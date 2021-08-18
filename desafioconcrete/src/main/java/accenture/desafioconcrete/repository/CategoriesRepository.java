package accenture.desafioconcrete.repository;

import accenture.desafioconcrete.entity.Categories;
import accenture.desafioconcrete.entity.Coupons;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Component
@FeignClient(name = "CATEGORIES-REPOSITORY", url = "https://cs-hsa-api-categories-rest.herokuapp.com/")
public interface CategoriesRepository {

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    Categories getCategories ();

}