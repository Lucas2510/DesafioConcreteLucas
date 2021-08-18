package accenture.desafioconcrete.service;

import accenture.desafioconcrete.entity.Coupons;
import accenture.desafioconcrete.repository.CouponsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CouponsServiceImp implements CouponsService {
    @Autowired
    private CouponsRepository couponsRepository;

    public List<Coupons> getCoupons(){
        return couponsRepository.getCoupons().stream().filter(coupons -> coupons.getExpiresAt().isAfter(LocalDate.now())).collect(Collectors.toList());
    }
}
