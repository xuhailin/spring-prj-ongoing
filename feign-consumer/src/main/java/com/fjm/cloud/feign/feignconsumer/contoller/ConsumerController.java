package com.fjm.cloud.feign.feignconsumer.contoller;

import com.fjm.cloud.feign.feignconsumer.service.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${DESCRIPTION}
 *
 * @author jingmin.feng@hand-china.com
 * @create 2018-06-06 17:17
 **/
@RestController
public class ConsumerController {


    @Autowired
    ComputeClient computeClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return computeClient.add(10, 20);
    }


}
