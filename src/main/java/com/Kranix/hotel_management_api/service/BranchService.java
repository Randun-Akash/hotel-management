package com.Kranix.hotel_management_api.service;

import com.Kranix.hotel_management_api.dto.request.RequestBranchDto;
import com.Kranix.hotel_management_api.dto.responses.ResponseBranchDto;
import com.Kranix.hotel_management_api.dto.responses.paginated.BranchPaginatedResponseDto;


public interface BranchService {

    public void create(RequestBranchDto dto);
    public void update(RequestBranchDto dto, String branchId);
    public void delete(String branchId);
    public ResponseBranchDto findById(String branchId);
    public BranchPaginatedResponseDto findAll(int page, int size, String searchText);
    public BranchPaginatedResponseDto findAllByHotelId(int page, int size, String searchText);
}
