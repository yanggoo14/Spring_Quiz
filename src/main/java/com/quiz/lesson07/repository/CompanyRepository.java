package com.quiz.lesson07.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quiz.lesson07.entity.CompanyEntity;

public interface CompanyRepository extends JpaRepository<CompanyEntity,Integer>{
	//Spring data JPA
	
	// save(entitly 객체)
	//optional<Entity 객체>
}
