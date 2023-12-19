package com.quiz.lesson03;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson03.bo.RealEstateBO;
import com.quiz.lesson03.domain.RealEstate;

@RequestMapping("/lesson03/quiz02")
@RestController
public class Lesson03Quiz02RestController {
	
	@RequestMapping("/2")
	public String quiz02_2() {
		int rowCount = RealEstateBO.addestatedAsField("썅떼빌리버 오피스텔 814호",45,"월세", 100000, 120);
		return "행의 개수" + rowCount;
	}
	
	
	
}
