package com.example.companydata.repository;

import com.example.companydata.data.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends CrudRepository<Company, String> {

}
