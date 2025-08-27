package com.Kranix.hotel_management_api.service.impl;

import com.Kranix.hotel_management_api.dto.request.RequestRoomImageDto;
import com.Kranix.hotel_management_api.dto.responses.ResponseRoomImageDto;
import com.Kranix.hotel_management_api.dto.responses.paginated.RoomImagePaginatedResponseDto;
import com.Kranix.hotel_management_api.service.RoomImageService;
import org.springframework.stereotype.Service;

@Service
public class RoomImageServiceImpl implements RoomImageService {
    @Override
    public void create(RequestRoomImageDto dto) {

    }

    @Override
    public void update(RequestRoomImageDto dto, String roomImageId) {

    }

    @Override
    public void delete(String roomImageId) {

    }

    @Override
    public ResponseRoomImageDto findById(String roomImageID) {
        return null;
    }

    @Override
    public RoomImagePaginatedResponseDto findAll(int page, int size, String roomId) {
        return null;
    }
}
