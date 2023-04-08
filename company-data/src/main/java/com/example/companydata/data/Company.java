package com.example.companydata.data;

import lombok.*;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@RestController
@Entity
public class Company {

    @Id
    private String name;
    private String field;
    private String desc;

}
