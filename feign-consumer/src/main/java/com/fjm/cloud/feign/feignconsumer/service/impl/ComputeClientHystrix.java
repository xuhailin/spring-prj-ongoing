package com.fjm.cloud.feign.feignconsumer.service.impl;

import com.fjm.cloud.feign.feignconsumer.service.ComputeClient;
import org.springframework.stereotype.Component;

/**
 * ${DESCRIPTION}
 *
 * @author jingmin.feng@hand-china.com
 * @create 2018-06-06 19:59
 **/
@Component
public class ComputeClientHystrix implements ComputeClient{
    @Override
    public String add(Integer a, Integer b) {
        //@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b
        return "go ahead";
    }
}
