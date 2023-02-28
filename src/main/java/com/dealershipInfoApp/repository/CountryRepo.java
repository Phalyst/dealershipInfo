package com.dealershipInfoApp.repository;

import com.dealershipInfoApp.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepo extends JpaRepository<Country, Integer> {

    public List<Country> findAllByOrderByNameAsc();

}


