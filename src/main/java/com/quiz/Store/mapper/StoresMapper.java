package com.quiz.Store.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.Store.domain.Store;

@Mapper
public interface StoresMapper {
	public List<Store> selectStore();
}
