package com.fjm.cloud.ribbon.ribbonconusmer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * ${DESCRIPTION}
 *
 * @author jingmin.feng@hand-china.com
 * @create 2018-06-06 19:54
 **/
@Service
public class ComputeService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "showErrorMsg")
    public String addService(){
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
    }

    public String showErrorMsg(){
        return "error";
    }
}
