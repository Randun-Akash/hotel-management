package com.Kranix.hotel_management_api.service.impl;

import com.Kranix.hotel_management_api.dto.request.RequestAddressDto;
import com.Kranix.hotel_management_api.dto.responses.ResponseAddressDto;
import com.Kranix.hotel_management_api.service.AddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Override
    public void create(RequestAddressDto dto) {

    }

    @Override
    public void update(RequestAddressDto dto, String addressId) {

    }

    @Override
    public void delete(String addressId) {

    }

    @Override
    public ResponseAddressDto findById(String addressId) {
        return null;
    }

    @Override
    public ResponseAddressDto findByBranchId(String branchId) {
        return null;
    }
}
