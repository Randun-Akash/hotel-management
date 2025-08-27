package com.Kranix.hotel_management_api.service.impl;

import com.Kranix.hotel_management_api.dto.request.RequestRoomDto;
import com.Kranix.hotel_management_api.dto.responses.ResponseRoomDto;
import com.Kranix.hotel_management_api.dto.responses.paginated.RoomPaginatedResponseDto;
import com.Kranix.hotel_management_api.service.RoomService;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {
    @Override
    public void create(RequestRoomDto dto) {

    }

    @Override
    public void update(RequestRoomDto dto, String roomId) {

    }

    @Override
    public void delete(String roomId) {

    }

    @Override
    public ResponseRoomDto findById(String roomId) {
        return null;
    }

    @Override
    public RoomPaginatedResponseDto findAll(int page, int size) {
        return null;
    }
}
