package com.ginszt.calc.module.calculate;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;

public class CalculateEntity {

    @Id
    @GeneratedValue
    private Long add;
    private Long substract;
    private Long divide;
    private Long multiply;

}
