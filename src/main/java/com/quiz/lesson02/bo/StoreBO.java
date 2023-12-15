package com.quiz.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson02.domain.Store;
import com.quiz.lesson02.mapper.StoreMapper;


@Service
public class StoreBO {
	@Autowired
	private StoreMapper storemapper;
	//input       output:List<Store>=>컨트롤러에게 줌
	public List<Store> getStoreList(){
		return storemapper.selectStoreList();
	}
}