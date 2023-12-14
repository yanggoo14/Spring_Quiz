package com.quiz.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/quiz02")
@RestController
public class Lesson01Quiz02 {

	@RequestMapping("/1")
	public List<Map<String, Object>> quiz02_1() {
		List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		map.put("rate", 15);
		map.put("directer", "봉준호");
		map.put("time", 131);
		map.put("title", "기생충");
		list.add(map);

		map = new HashMap<>();
		map.put("rate", 0);
		map.put("directer", "로베르토 베니니");
		map.put("time", 116);
		map.put("title", "인생은 아름다워");
		list.add(map);

		map = new HashMap<>();
		map.put("rate", 12);
		map.put("directer", "크리스토퍼 놀란");
		map.put("time", 147);
		map.put("title", "인셉션");
		list.add(map);

		map = new HashMap<>();
		map.put("rate", 19);
		map.put("directer", "윤종빈");
		map.put("time", 133);
		map.put("title", "범죄와의 전쟁");
		list.add(map);

		map = new HashMap<>();
		map.put("rate", 15);
		map.put("directer", "프란시스로렌스");
		map.put("time", 137);
		map.put("title", "헝거게임");
		list.add(map);

		return list;

	}
	@RequestMapping("/2")
	public List<Quiz02Data> quiz02_2() {
		//@ResponseBody + return String => HttpMessageConverter  => String => HTML 변환 
		//@ResponseBody + return 객체(Map, 클래스, List....) => HttpMessageConverter => Jackson 라이브러리 => Json 응답
		
		
		List<Quiz02Data> list = new ArrayList<>();
		
		Quiz02Data data = new Quiz02Data();
		data.setTitle("안녕하세요 가입인사드립니다");
		data.setUser("marobiana");
		data.setContent("잘부탁드립니다.");
		list.add(data);
		
		data = new Quiz02Data();
		data.setTitle("헐 대박");
		data.setUser("bada");
		data.setContent("오늘 목요일이였어요");
		list.add(data);
		
		return list;
		
	}
		@RequestMapping("/3")
		public ResponseEntity quiz02_3() {
			Quiz02Data data = new Quiz02Data();
			data.setTitle("안녕하세요 가입인사드립니다");
			data.setUser("maroniana");
			data.setContent("안녕하세요 오늘 가입했어요");
			
			return new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR);
		}

}
