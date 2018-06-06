package com.fjm.cloud.ribbon.ribbonconusmer.controller;

import com.fjm.cloud.ribbon.ribbonconusmer.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ${DESCRIPTION}
 *
 * @author jingmin.feng@hand-china.com
 * @create 2018-06-06 14:05
 **/
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public String add() {
//        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
//    }

    @Autowired
    private ComputeService computeService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return computeService.addService();
    }
}
