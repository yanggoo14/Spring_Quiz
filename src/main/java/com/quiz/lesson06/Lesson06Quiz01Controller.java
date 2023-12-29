package com.quiz.lesson06;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.quiz.lesson06.bo.BookMarkBO;
import com.quiz.lesson06.domain.BookMark;

@Controller
@RequestMapping("/lesson06/quiz01")
public class Lesson06Quiz01Controller {
	
	@Autowired
	private BookMarkBO BookmarkBO;
	public String quiz01(Model model){
		List<BookMark> bookmarklist = BookmarkBO.getBookMarkList();
		model.addAttribute("bookmarklist",bookmarklist);
		return "lesson06/afterwebview";
	}
	
	
	
	@RequestMapping("/add-web-view")
	public String addWebView() {
		return	"lesson06/addWeb";
	}
	
	//insert
	@ResponseBody
	@PostMapping("/add-web")
	public String addWeb(
			@RequestParam("name") String name,
			@RequestParam("address") String address) {
		
		return "성공";
	}
	//성공 화면
	@GetMapping("/after-web-view")
	public String afterAddView() {
		return "lesson06/afterwebview";
	}
}
