package com.ginszt.calc.module.calc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Calculate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String type;
    private long firstNumb;
    private long secondNumb;

    public long getId() {
        return id;
    }

    public Calculate setId(long id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public Calculate setType(String type) {
        this.type = type;
        return this;
    }

    public long getFirstNumb() {
        return firstNumb;
    }

    public Calculate setFirstNumb(long firstNumb) {
        this.firstNumb = firstNumb;
        return this;
    }

    public long getSecondNumb() {
        return secondNumb;
    }

    public Calculate setSecondNumb(long secondNumb) {
        this.secondNumb = secondNumb;
        return this;
    }
}
