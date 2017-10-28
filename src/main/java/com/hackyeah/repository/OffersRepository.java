package com.hackyeah.repository;


import com.hackyeah.entity.Offer;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;

interface OffersRepository extends CrudRepository<Offer, BigDecimal>{
}
