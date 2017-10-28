package com.hackyeah.repository;


import com.hackyeah.entity.Seller;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;

interface SellersRepository extends CrudRepository<Seller, BigDecimal> {
}
