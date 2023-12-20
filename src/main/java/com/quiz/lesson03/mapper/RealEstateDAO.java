package com.quiz.lesson03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.quiz.lesson03.domain.RealEstate;

@Repository
public interface RealEstateDAO {
public RealEstate selectRealEstate(int id);
	
	public List<RealEstate> selectRealEstateByRentPrice(int rentPrice);

	public List<RealEstate> selectRealEstateByAreaAndPrice(
			// myBatis 문법 상 파라미터는 단 한개만 xml로 보낼 수 있다.
			// 파라미터들을 하나의 맵에 담아서 보낸다.
			// 맵으로 만들어주는 어노테이션 @Param
			@Param("area") int area, 
			@Param("price") int price);
	
	public int updateRealEstateById(
			@Param("id") int id,
			@Param("type") String type,
			@Param("price") int price);
	
	public int deleteRealEstateById(int id);
}
