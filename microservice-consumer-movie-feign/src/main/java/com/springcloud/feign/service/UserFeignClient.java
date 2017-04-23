package com.springcloud.feign.service;

import com.springcloud.feign.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by liulei on 2017/4/23.
 */
@FeignClient(name = "microservice-provider-user")
public interface UserFeignClient {
    @RequestMapping("/{id}")
    public User findByIdFeign(@RequestParam("id") Long id);
}
