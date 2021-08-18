package accenture.desafioconcrete.repository;

import accenture.desafioconcrete.entity.Coupons;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Component
@FeignClient(name = "COUPONS-REPOSITORY", url = "https://cs-hsa-api-coupons-rest.herokuapp.com")
public interface CouponsRepository {

    @RequestMapping(value = "/coupons", method = RequestMethod.GET)
     List<Coupons> getCoupons ();

}