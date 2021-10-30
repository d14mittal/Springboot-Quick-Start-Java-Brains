package com.example.companydata.data;

import lombok.*;
import org.springframework.web.bind.annotation.RestController;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@RestController
public class Company {

    private String name;
    private String field;
    private String desc;

}
