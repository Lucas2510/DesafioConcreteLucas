package accenture.desafioconcrete.controller;

import accenture.desafioconcrete.entity.Coupons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import accenture.desafioconcrete.service.CouponsService;
import java.util.List;


@RestController
public class CouponsController {
    @Autowired
    private CouponsService couponsService;

    @GetMapping("/coupons")
    public List <Coupons> CouponsDTO() {
        return couponsService.getCoupons();
    }
}
