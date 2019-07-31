package com.boot.learning2.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.boot.learning3.bean.CountryV;
import com.boot.learning5.service.CountryService;
import com.boot.learning8.util.Constants;

@RestController 
public class CountryController {  
   
    @Autowired
    private CountryService countryService;
    
    @RequestMapping("/getCountryList")  
    public List<CountryV> getCountries(){  
       
        //Access of default method
        countryService.methodDefault();
        
        //Access of Static method
        CountryService.methodStatic();
        
        
        
        System.out.println(Constants.NAME_OF_APPLICATION);       
        Iterator<CountryV> iter = countryService.findAll().iterator();
        List<CountryV> returnList =new ArrayList<CountryV>();
        while (iter.hasNext()) {
            CountryV value = iter.next();
            returnList.add(value);
        }
        return returnList;  
    }
}
