package com.ginszt.calc.module.service;

import com.ginszt.calc.module.model.Result;
import org.springframework.stereotype.Service;

@Service
public class Add {

    public Result add (long firstNumb, long secondNumb) {
        long sum = firstNumb + secondNumb;
        return new Result(sum);
    }

}
