package com.quiz.lesson07.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.quiz.lesson07.entity.RecruitEntity;

public interface RecruitRepository extends JpaRepository<RecruitEntity, Integer>{
	
	//JPQL => Entity에 조회
	public List<RecruitEntity> findByCompanyId(int companyId); //2 
	
	public List<RecruitEntity> findByPositionAndType(String position, String type); //3 
	
	public List<RecruitEntity> findByTypeOrSalaryGreaterThanEqual(String type, int salary); //4 
	
	public List<RecruitEntity> findTop3ByTypeOrderBySalaryDesc(String type); //5
	
	public List<RecruitEntity> findByRegionAndSalaryBetween(String region, int salaryStart, int salaryEnd); //6
	
	@Query(value = "select * from `recruit` "
			+ "where `deadline` > :deadline "
			+ "and `salary >= :salary "
			+ "and `type` =:type "
			+ "order by `salary` DESC"   // SQL문
			, nativeQuery = true)
	public List<RecruitEntity> findByDeadlineSalaryType(
			@Param("deadline") String deadline,
			@Param("salary") int salary,
			@Param("type") String type);

}
