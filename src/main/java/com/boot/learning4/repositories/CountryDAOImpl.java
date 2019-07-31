package com.boot.learning4.repositories;

import java.util.List;
import java.util.Optional;

/**
 * @author Himanshu Malvi | himanshu.malvi@in.ibm.com
 * @purpose Maintain the Country repository
 * @date 07/Jul/2019
 * @version (Declare Version based on Dev.Env. release) 1.0 - 07/Jul/2019 - Himanshu - Created File to keep concrete methods for Country 1.1 -
 */

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.boot.learning3.bean.CountryV;
import com.boot.learning8.util.Constants;

@Repository
@Transactional
public class CountryDAOImpl implements CountryDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public <S extends CountryV> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends CountryV> Iterable<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<CountryV> findById(Long id) {

        return null;
    }

    @Override
    public boolean existsById(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Iterable<CountryV> findAll() {
        Session session = this.sessionFactory.getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<CountryV> criteriaQuery = builder.createQuery(CountryV.class);
        Root<CountryV> root = criteriaQuery.from(CountryV.class);
        criteriaQuery.select(root);
        Predicate condition = builder.notEqual(root.get("configStatusCd"), "ACTIVE");

        // where(root.get("configStatusCd").equals("ACTIVE"));
        // .where(root.get("lockedByUserId").isNotNull());
       // criteriaQuery.where(condition);
        Query<CountryV> query = session.createQuery(criteriaQuery);
        List<CountryV> countryVList = query.getResultList();
        for (CountryV countryV : countryVList) {
            System.out.println(countryV.getLockedByUserId());

        }
        return countryVList;
    }

    @Override
    public Iterable<CountryV> findAllById(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(CountryV entity) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAll(Iterable<? extends CountryV> entities) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub

    }

    @Override
    public String methodExtra() {        
        return Constants.NAME_OF_APPLICATION;
    }


}
