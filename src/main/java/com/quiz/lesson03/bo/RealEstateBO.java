package com.quiz.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson03.mapper.RealEstateMapper;

@Service

public class RealEstateBO {
	@Autowired
	private RealEstateMapper realestate;
	public int addestatedAsField(int realtorId, String address, int area, String type, int price, int rentprince) {
	
		return realestate.insertRealEstateASField(realtorId, address, area, type, price, rentprince);
		}
	}

