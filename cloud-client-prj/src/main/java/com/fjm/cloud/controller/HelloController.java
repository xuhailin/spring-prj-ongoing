package com.fjm.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
//import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 可以看到注入了 Registration 和 DiscoveryClient 两个对象：
 * Registration 服务注册接口，包含了获取服务 ID 的方法。
 * DiscoveryClient 服务发现客户端，具有以下方法：
 * String description(); 获取描述
 * ServiceInstance getLocalServiceInstance(); @Deprecated 方法被删除，推荐不要使用。获取本地服务实例
 * List<ServiceInstance> getInstances(String serviceId);  通过服务 ID，获取当前服务的服务实例
 * List<String> getServices(); 获取所有服务 ID 列表
 * <p>
 * Created by fjm on 2018/4/12.
 */
@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private DiscoveryClient discoveryClient;// 服务发现客户端
//    @Autowired
//    private Registration registration;// 服务注册

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() throws Exception {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        logger.info("/hello, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
        return "Hello World";
    }

//    /**
//     * 获取当前服务的服务实例
//     *
//     * @return ServiceInstance
//     */
//    public ServiceInstance serviceInstance() {
//        List<ServiceInstance> list = discoveryClient.getInstances(registration.getServiceId());
//        if (list != null && list.size() > 0) {
//            return list.get(0);
//        }
//        return null;
//    }

}
