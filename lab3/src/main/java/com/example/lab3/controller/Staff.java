package com.example.lab3.controller;

import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder.Default;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
    private String id; // email
    private String fullname;

    @Default
    private String photo = "download.jpg";

    @Default
    private Boolean gender = true;

    @Default
    private Date birthday = new Date();

    @Default
    private Double salary = 12345.6789;

    @Default
    private Integer level = 0;
}
