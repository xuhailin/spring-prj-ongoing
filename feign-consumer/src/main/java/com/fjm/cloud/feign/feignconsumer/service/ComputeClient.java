package com.fjm.cloud.feign.feignconsumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ${DESCRIPTION}
 *
 * @author jingmin.feng@hand-china.com
 * @create 2018-06-06 17:16
 **/
@FeignClient("ribbon-consumer")
public interface ComputeClient {

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    String add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

}
