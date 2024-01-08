package com.quiz.lesson07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson07.bo.CompanyBO;
import com.quiz.lesson07.entity.CompanyEntity;

@RequestMapping("/lesson07/quiz01")
@RestController
public class Lesson07Quiz01RestController {
	
	@Autowired
	private CompanyBO companyBO;
	@GetMapping("/save1")
	public CompanyEntity create() {
		String name = "넥손";
		String business = "컨텐츠 게임";
		String scale = "대기업";
		int headcount = 3585;
		
		return companyBO.addcompany(name, business, scale, headcount);
	}
	@GetMapping("/save2")
	public CompanyEntity save2() {
		return companyBO.addcompany("버블팡", "여신 금융업", "대기업", 6834);
	}
	@GetMapping("/update1")
	public CompanyEntity update1() {
		//id 8번 scale -> 중소기업  headcount -> 34
		return companyBO.updateCompanyById(8, "중소기업", 34);
	}
	@GetMapping("/delete")
	public String delete() {
		companyBO.deleteById(8);
		return "삭제완료";
	}
}
