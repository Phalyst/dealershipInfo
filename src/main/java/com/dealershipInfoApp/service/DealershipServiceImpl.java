package com.dealershipInfoApp.service;

import com.dealershipInfoApp.model.Country;
import com.dealershipInfoApp.model.DealerInformation;
import com.dealershipInfoApp.model.Province;
import com.dealershipInfoApp.repository.CountryRepo;
import com.dealershipInfoApp.repository.DealershipRepo;
import com.dealershipInfoApp.repository.ProvinceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DealershipServiceImpl implements DealershipService{

    @Autowired
    CountryRepo countryRepo;

    @Autowired
    ProvinceRepo provinceRepo;

    @Autowired
    DealershipRepo dealershipRepo;

    @Override
    public List<Country> getCountryDetails() {
        return countryRepo.findAllByOrderByNameAsc();
    }

    @Override
    public Optional<DealerInformation> getDealershipInfo(Integer id) {
        return dealershipRepo.findById(id);
    }

    @Override
    public List<Province> getProvinceDetails(String countryCode) {
        return provinceRepo.findByCountryCode(countryCode);
    }

    @Override
    public DealerInformation saveDealerInfo(DealerInformation dealerInformation) {
        return dealershipRepo.save(dealerInformation);
    }

    @Override
    public DealerInformation updateDealerInfo(DealerInformation dealerInformation) {
        DealerInformation dealershipInfo = getDealershipInfo(dealerInformation.getDealerShipId()).orElseThrow(() ->
        {
            return new IllegalArgumentException("No Dealer found with Id : " +dealerInformation.getDealerShipId() );
        });
        dealershipRepo.save(dealershipInfo);
        return dealershipInfo;
    }
}
