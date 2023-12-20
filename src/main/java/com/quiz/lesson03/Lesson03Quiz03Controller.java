package com.quiz.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson03.bo.RealEstateBO;

@RestController
public class Lesson03Quiz03Controller {
	@Autowired
	private RealEstateBO realestateBO;
	
	@RequestMapping("/lesson03/quiz03/1")
	public String quiz03_1(
			@RequestParam("id") int id,
			@RequestParam("type") String type,
			@RequestParam("price") int price
			) {
		int rowCount = realestateBO.updateRealEstateById(id, type, price);
		
		return "성공" + rowCount;
	}
}
