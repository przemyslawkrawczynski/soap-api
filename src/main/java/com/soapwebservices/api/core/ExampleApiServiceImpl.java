package com.soapwebservices.api.core;

import com.soapwebservices.api.apidefinition.ExampleApiService;
import com.soapwebservices.api.domain.InfoDto;

public class ExampleApiServiceImpl implements ExampleApiService {

    @Override
    public InfoDto getTestInfoDto(Integer current) {
        return new InfoDto();
    }
}
