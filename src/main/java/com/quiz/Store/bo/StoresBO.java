package com.quiz.Store.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.Store.domain.Store;
import com.quiz.Store.mapper.StoresMapper;

@Service
public class StoresBO {
	@Autowired
	private StoresMapper storesmapper;
	public List<Store> getStore(){
		return storesmapper.selectStore();
	}
}
