package com.fjm.cloud.feign.feignconsumer.service;

import com.fjm.cloud.feign.feignconsumer.service.impl.ComputeClientHystrix;
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
@FeignClient(value = "ribbon-consumer",fallback = ComputeClientHystrix.class)
public interface ComputeClient {

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    String add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

}
