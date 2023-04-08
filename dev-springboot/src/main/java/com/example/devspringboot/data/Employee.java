package com.example.devspringboot.data;


import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {


    private Integer empID;
    private String name;
    private String stream;

}
