package com.Kranix.hotel_management_api.service;


import com.Kranix.hotel_management_api.dto.request.RequestRoomDto;
import com.Kranix.hotel_management_api.dto.responses.ResponseRoomDto;

import com.Kranix.hotel_management_api.dto.responses.paginated.RoomPaginatedResponseDto;

public interface RoomService {

    public void create(RequestRoomDto dto);
    public void update(RequestRoomDto dto, String roomId);
    public void delete(String roomId);
    public ResponseRoomDto findById(String roomId);
    public RoomPaginatedResponseDto findAll(int page, int size);
}
