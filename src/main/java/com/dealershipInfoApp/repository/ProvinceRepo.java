package com.dealershipInfoApp.repository;

import com.dealershipInfoApp.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinceRepo extends JpaRepository<Province, Integer> {

    List<Province> findByCountryCode(String countryCode);
}
