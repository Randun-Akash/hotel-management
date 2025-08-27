package com.Kranix.hotel_management_api.service.impl;

import com.Kranix.hotel_management_api.dto.request.RequestBranchDto;
import com.Kranix.hotel_management_api.dto.responses.ResponseBranchDto;
import com.Kranix.hotel_management_api.dto.responses.paginated.BranchPaginatedResponseDto;
import com.Kranix.hotel_management_api.service.BranchService;
import org.springframework.stereotype.Service;

@Service
public class BranchServiceImpl implements BranchService {
    @Override
    public void create(RequestBranchDto dto) {

    }

    @Override
    public void update(RequestBranchDto dto, String branchId) {

    }

    @Override
    public void delete(String branchId) {

    }

    @Override
    public ResponseBranchDto findById(String branchId) {
        return null;
    }

    @Override
    public BranchPaginatedResponseDto findAll(int page, int size, String searchText) {
        return null;
    }

    @Override
    public BranchPaginatedResponseDto findAllByHotelId(int page, int size, String searchText) {
        return null;
    }
}
