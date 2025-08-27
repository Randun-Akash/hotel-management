package com.Kranix.hotel_management_api.service;


import com.Kranix.hotel_management_api.dto.request.RequestRoomImageDto;
import com.Kranix.hotel_management_api.dto.responses.ResponseRoomImageDto;
import com.Kranix.hotel_management_api.dto.responses.paginated.RoomImagePaginatedResponseDto;

public interface RoomImageService {
    public void create(RequestRoomImageDto dto);
    public void update(RequestRoomImageDto dto, String roomImageId);
    public void delete(String roomImageId);
    public ResponseRoomImageDto findById(String roomImageID);
    public RoomImagePaginatedResponseDto findAll(int page, int size, String roomId);
}
