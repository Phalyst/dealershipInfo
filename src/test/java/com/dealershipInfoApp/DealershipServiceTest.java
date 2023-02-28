package com.dealershipInfoApp;

import com.dealershipInfoApp.model.Country;
import com.dealershipInfoApp.model.DealerInformation;
import com.dealershipInfoApp.repository.CountryRepo;
import com.dealershipInfoApp.repository.DealershipRepo;
import com.dealershipInfoApp.service.DealershipService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class DealershipServiceTest {


    @Mock
    private DealershipRepo dealershipRepo;

    @Mock
    private CountryRepo countryRepo;

    @InjectMocks
    private DealershipService dealershipService;

    @Test
    public void create_dealerInformation_Test() {
        DealerInformation dealerInformation = new DealerInformation();
        dealerInformation.setDealerShipName("Test");
        dealerInformation.setCountry("ZA");
        //Mockito.when(dealershipService.saveDealerInfo(dealerInformation)).thenReturn(dealerInformation);
        Mockito.when(dealershipRepo.save(dealerInformation)).thenReturn(dealerInformation);
        DealerInformation savedDealer = dealershipService.saveDealerInfo(dealerInformation);
        assertEquals(savedDealer.getDealerShipName(), "Test");
    }

    @Test
    public void get_country_details_test() {
        Country country = new Country();
        country.setName("test");
        List<Country> contries =  new ArrayList<>();
        contries.add(country);

        Mockito.when(countryRepo.findAllByOrderByNameAsc()).thenReturn(contries);
        assertEquals(1, dealershipService.getCountryDetails().size());
    }
}
