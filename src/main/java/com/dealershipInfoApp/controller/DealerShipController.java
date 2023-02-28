package com.dealershipInfoApp.controller;

import com.dealershipInfoApp.model.Country;
import com.dealershipInfoApp.model.DealerInformation;
import com.dealershipInfoApp.model.Province;
import com.dealershipInfoApp.service.DealershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/DealerShipInfo")
public class DealerShipController {

    @Autowired
    DealershipService dealershipService;

    @GetMapping("/getCountryCodes")
    public List<Country> getCountryDetails() {

        return dealershipService.getCountryDetails();
    }

    @GetMapping("/getDealerInfo/{id}")
    public Optional<DealerInformation> getDealerInfo(@PathVariable Integer id) {

        return dealershipService.getDealershipInfo(id);
    }

    @GetMapping("/getProvinceByCountryCode/{countryCode}")
    public List<Province> getProvinceDetails(@PathVariable String countryCode) {

        return dealershipService.getProvinceDetails(countryCode);
    }

    @PostMapping("/saveDealerInfo")
    public DealerInformation saveDealerInfo(@RequestBody DealerInformation dealerInformation) {

        return dealershipService.saveDealerInfo(dealerInformation);
    }

    @PutMapping("/updateDealerInfo")
    public DealerInformation updateDealerInfo(@RequestBody DealerInformation dealerInformation) {

        return dealershipService.saveDealerInfo(dealerInformation);
    }
}
