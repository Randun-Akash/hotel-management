package com.Kranix.hotel_management_api.service;


import com.Kranix.hotel_management_api.dto.request.RequestHotelDto;
import com.Kranix.hotel_management_api.dto.responses.ResponseHotelDto;
import com.Kranix.hotel_management_api.dto.responses.paginated.HotelPaginatedResponseDto;

public interface HotelService {

    public void create(RequestHotelDto dto);
    public void update(RequestHotelDto dto, String hotelId);
    public void delete(String hotelId);
    public ResponseHotelDto findById(String hotelId);
    public HotelPaginatedResponseDto findAll(int page,int size,String searchText);
}
