package com.fjm.cloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${DESCRIPTION}
 *
 * @author jingmin.feng@hand-china.com
 * @create 2018-06-06 20:41
 **/

@RefreshScope
@RestController
class TestController {

    @Value("${from}")
    private String from;

    @RequestMapping("/from")
    public String from() {

        return this.from;
    }

}