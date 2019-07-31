package com.boot.learning5.service;

import org.springframework.data.repository.CrudRepository;

import com.boot.learning3.bean.CountryV;

public interface CountryService extends CrudRepository<CountryV, Long> {
    
    public String methodExtra();
    
    public default void methodDefault() {
        System.out.println("Default Method are allow only in interfaces");
    }
    
    public static void methodStatic() {
        System.out.println("static Method are allow only in interfaces");
    }

}
