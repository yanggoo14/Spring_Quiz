package com.quiz.lesson07.bo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson07.entity.CompanyEntity;
import com.quiz.lesson07.repository.CompanyRepository;

@Service
public class CompanyBO {
	
	@Autowired
	private CompanyRepository companyRepository;
	public CompanyEntity addcompany(String name, String business, String scale, int headcount) {
		
		CompanyEntity company = CompanyEntity.builder()
				.name(name)
				.business(business)
				.scale(scale)
				.headcount(headcount)
				.build();
		
		return companyRepository.save(company);
	}
	public CompanyEntity updateCompanyById(int id, String scale, int headcount) {
		
		CompanyEntity company = companyRepository.findById(id).orElse(null);
		//  companyRepository에 id를 찾지 못하면 null값
		if(company != null) {
				company = company.toBuilder()  
						//기존 필드 유지하고 일부 필드만 변경
						.scale(scale)
						.headcount(headcount)
						.build();
				company = companyRepository.save(company);
				// ★★ company에 다시 꼭 저장을 해줘야함!
		}
		return company;
	}
	public void deleteById(int id) {
		Optional<CompanyEntity> companyOptional = companyRepository.findById(id);
		companyOptional.ifPresent(c -> companyRepository.delete(c));
	}
}
