package com.boot.learning7.converters;

import org.springframework.core.convert.converter.Converter;

import com.boot.learning3.bean.CountryV;

/**
 * @author Himanshu Malvi | himanshu.malvi@in.ibm.com
 * @purpose Convert pojos or modification in data
 * @date 07/Jul/2019
 * @version (Declare Version based on Dev.Env. release)
 *          1.0 - 07/Jul/2019 - Himanshu - Created File to keep concrete methods  
 *          1.1 -   
 */

public class CountryToState implements Converter<CountryV, CountryV>{

    /* (non-Javadoc)
     * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
     */
    @Override
    public CountryV convert(CountryV countryV) {
        return null;
    }

}
