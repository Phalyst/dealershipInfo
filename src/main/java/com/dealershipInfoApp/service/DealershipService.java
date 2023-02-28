package com.dealershipInfoApp.service;

import com.dealershipInfoApp.model.Country;
import com.dealershipInfoApp.model.DealerInformation;
import com.dealershipInfoApp.model.Province;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DealershipService {

    public List<Country> getCountryDetails();

    public Optional<DealerInformation> getDealershipInfo(Integer id);

    public List<Province> getProvinceDetails(String countryCode);

    public DealerInformation saveDealerInfo(DealerInformation dealerInformation);

    public DealerInformation updateDealerInfo(DealerInformation dealerInformation);

}
