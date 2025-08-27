package com.Kranix.hotel_management_api.service.impl;

import com.Kranix.hotel_management_api.dto.request.RequestFacilityDto;
import com.Kranix.hotel_management_api.dto.responses.ResponseFacilityDto;
import com.Kranix.hotel_management_api.dto.responses.paginated.FacilityPaginatedResponseDto;
import com.Kranix.hotel_management_api.service.FacilityService;
import org.springframework.stereotype.Service;

@Service
public class FacilityServiceImpl implements FacilityService {
    @Override
    public void create(RequestFacilityDto dto) {

    }

    @Override
    public void update(RequestFacilityDto dto, String facilityId) {

    }

    @Override
    public void delete(String facilityId) {

    }

    @Override
    public ResponseFacilityDto findById(String facilityId) {
        return null;
    }

    @Override
    public FacilityPaginatedResponseDto findAll(int page, int size, String roomId) {
        return null;
    }
}
