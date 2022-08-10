package com.tavana.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @autor mohammad saeid tavana
 */
@Service
public class customerServiceImpl implements CustomerService {

    @Autowired
    RestTemplate restTemplate;
    @Override
    public String getservice() {

        String mesage =restTemplate.getForObject("http://STORE/store/getname",String.class);

        return mesage;

    }
}
