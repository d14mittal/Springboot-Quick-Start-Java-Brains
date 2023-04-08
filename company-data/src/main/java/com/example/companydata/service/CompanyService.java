package com.example.companydata.service;


import com.example.companydata.data.Company;
import com.example.companydata.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private Company company;

    @Autowired
    private CompanyRepository repository;

    private final List<Company> list = new ArrayList<>(Arrays.asList(
            new Company("amazon", "ecommerce", "pbc"),
            new Company("microsoft", "software", "pbc"),
            new Company("swiggy", "delivery", "startup")
    ));

    public List<Company> getAllCompanies() {
//        return list;
        List<Company> list = new ArrayList<>();
        repository.findAll().forEach(list::add);
        return list;
    }

    public Company getCompany(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                return list.get(i);
            }
        }
        return company;
//        Company company=repository.findById(name).get();
//        return company;
    }

    public void addCompany(Company company) {
        list.add(company);
//        repository.save(company);
    }


    public void updateCompany(String name, Company company) {
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i).getName())) {
                list.set(i, company);
                return;
            }
        }
    }

    public void deleteCompany(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                list.remove(i);
            }
        }
    }
}
