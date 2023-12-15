package com.quiz.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Lesson01Quiz03 {
	@RequestMapping("/lesson01/quiz03")
	public String quiz_03() {
		//@ResponseBody가 아닌 단독으로 사용하는 @Controller + return String
		//ViewResolver에 의해 리턴된 String의 jsp경로를 찾고 화면이 구성된다 => HTML응답 
		
		return "lesson01/quiz03";
	}
}
