package com.springcloud.ribbon.service;

import com.springcloud.ribbon.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by liulei on 2017/4/23.
 */
@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;

    public User findById(Long id) {
        return this.restTemplate.getForObject("http://springcloud-server/" + id, User.class);
    }
}
