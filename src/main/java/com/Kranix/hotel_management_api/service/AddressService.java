package com.Kranix.hotel_management_api.service;

import com.Kranix.hotel_management_api.dto.request.RequestAddressDto;
import com.Kranix.hotel_management_api.dto.responses.ResponseAddressDto;
import com.Kranix.hotel_management_api.dto.responses.paginated.AddressPaginatedResponseDto;


public interface AddressService {

    public void create(RequestAddressDto dto);
    public void update(RequestAddressDto dto, String addressId);
    public void delete(String addressId);
    public ResponseAddressDto findById(String addressId);
    public ResponseAddressDto findByBranchId(String branchId);

}
