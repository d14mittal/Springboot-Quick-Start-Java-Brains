package com.example.devspringboot.controller;

import com.example.devspringboot.data.Company;
import com.example.devspringboot.service.ComanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerClass {

  @Autowired private ComanyService comanyService;

  @GetMapping(path = "/Allcompanies")
  public List<Company> getAllCompany() {
    return comanyService.getAllCompanies();
  }

  @GetMapping(path = "/Allcompanies/{name}")
  public Company getCompany(@PathVariable String name) {
    return comanyService.getCompany(name);
  }

  @PostMapping(path = "/addCompany")
  public void addCompany(@RequestBody Company company){
    comanyService.addCompany(company);
  }

  @PutMapping(path = "/updateCompany/{name}")
  public void updateCompany(@PathVariable String name, @RequestBody Company company){
    comanyService.updateCompany(name, company);
  }
  @DeleteMapping(path = "deleteCompany/{name}")
  public void deleteCompany(@PathVariable String name){
    comanyService.deleteCompany(name);
  }


}
