package com.Kranix.hotel_management_api.service;


import com.Kranix.hotel_management_api.dto.request.RequestFacilityDto;
import com.Kranix.hotel_management_api.dto.responses.ResponseFacilityDto;
import com.Kranix.hotel_management_api.dto.responses.paginated.FacilityPaginatedResponseDto;


public interface FacilityService {
    public void create(RequestFacilityDto dto);
    public void update(RequestFacilityDto dto, String facilityId);
    public void delete(String facilityId);
    public ResponseFacilityDto findById(String facilityId);
    public FacilityPaginatedResponseDto findAll(int page, int size, String roomId);
}
