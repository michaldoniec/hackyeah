package com.hackyeah.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class SellerController {

	@RequestMapping("https://allegroapi.io/categories/2")
	public void getCategories(){

	}
}
