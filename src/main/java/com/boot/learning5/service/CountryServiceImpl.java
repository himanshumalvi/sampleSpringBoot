package com.boot.learning5.service;

/**
 * @author Himanshu Malvi | himanshu.malvi@in.ibm.com
 * @purpose 
 * @date 07/Jul/2019
 * @version (Declare Version based on Dev.Env. release)
 *          1.0 - 07/Jul/2019 - Himanshu - Created File to log concrete methods CountryService
 *          1.1 - 08/Jul/2019 - Himanshu - 
 */
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.boot.learning3.bean.CountryV;
import com.boot.learning4.repositories.CountryDAO;

public class CountryServiceImpl implements CountryService{

    @Autowired 
    private CountryDAO countryDAO;
    
    @Override
    public <S extends CountryV> S save(S entity) {
        return countryDAO.save(entity);
    }

    @Override
    public <S extends CountryV> Iterable<S> saveAll(Iterable<S> entities) {
        return countryDAO.saveAll(entities);
    }

    @Override
    public Optional<CountryV> findById(Long id) {
        return  countryDAO.findById(id);
    }

    @Override
    public boolean existsById(Long id) {       
        return countryDAO.existsById(id);
    }

    @Override
    public Iterable<CountryV> findAll() {
        return countryDAO.findAll();
    }

    @Override
    public Iterable<CountryV> findAllById(Iterable<Long> ids) {
        return countryDAO.findAllById(ids);
    }

    @Override
    public long count() {
        return countryDAO.count();
    }

    @Override
    public void deleteById(Long id) {
        countryDAO.deleteById(id);        
    }

    @Override
    public void delete(CountryV entity) {
        countryDAO.delete(entity);        
    }

    @Override
    public void deleteAll(Iterable<? extends CountryV> entities) {
        countryDAO.deleteAll(entities);        
    }

    @Override
    public void deleteAll() {
        countryDAO.deleteAll();        
    }

    @Override
    public String methodExtra() {
        // TODO Auto-generated method stub
        return countryDAO.methodExtra();
    }      
}
