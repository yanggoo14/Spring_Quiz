package com.quiz.Store.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.quiz.Store.domain.Store;

@Repository
public interface StoresMapper {
	public List<Store> selectStore();
}
