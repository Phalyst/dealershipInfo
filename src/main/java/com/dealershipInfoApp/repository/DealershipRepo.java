package com.dealershipInfoApp.repository;

import com.dealershipInfoApp.model.DealerInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealershipRepo extends JpaRepository<DealerInformation, Integer> {


}
