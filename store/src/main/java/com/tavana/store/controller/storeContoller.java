package com.tavana.store.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author  mohammad saeid tavana
 */
@RestController
@RequestMapping("/store")
public class storeContoller {

    private static final String storeName="hyper kala";

    @GetMapping("/getname")
    public String getStorName(){

        return "store name is : "+storeName;
    }
}
