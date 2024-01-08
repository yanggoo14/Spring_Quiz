package com.quiz.lesson06.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.quiz.lesson06.domain.Bookmark;

@Mapper
public interface BookmarkMapper {
	public void insertBookmark(
			@Param("title") String title, 
			@Param("url") String url);
	
	public List<Bookmark> selectBookmarkList();
	
	public int deleteBookmarkById(int id);
}
