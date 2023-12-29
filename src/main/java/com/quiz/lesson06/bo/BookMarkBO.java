package com.quiz.lesson06.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson06.domain.BookMark;
import com.quiz.lesson06.mapper.BookMarkMapper;

@Service
public class BookMarkBO {
	
	@Autowired
	private BookMarkMapper Bookmarkmapper;
	public List<BookMark> getBookMarkList(){
		return Bookmarkmapper.selectBookMarkList();
	}
}
