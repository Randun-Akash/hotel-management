package com.Kranix.hotel_management_api.service.impl;

import com.Kranix.hotel_management_api.Repository.HotelRepo;
import com.Kranix.hotel_management_api.dto.request.RequestHotelDto;
import com.Kranix.hotel_management_api.dto.responses.ResponseHotelDto;
import com.Kranix.hotel_management_api.dto.responses.paginated.HotelPaginatedResponseDto;
import com.Kranix.hotel_management_api.entity.Hotel;
import com.Kranix.hotel_management_api.service.HotelService;
import com.Kranix.hotel_management_api.util.ByteCodeHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {

    private final HotelRepo hotelRepo;
    private final ByteCodeHandler byteCodeHandler;

    @Override
    public void create(RequestHotelDto dto) {

    }

    @Override
    public void update(RequestHotelDto dto, String hotelId) {

    }

    @Override
    public void delete(String hotelId) {

    }

    @Override
    public ResponseHotelDto findById(String hotelId) {
        return null;
    }

    @Override
    public HotelPaginatedResponseDto findAll(int page, int size, String searchText) {
        return null;
    }

    private Hotel toHotel(RequestHotelDto dto) throws SQLException {
        return dto==null?null:
                Hotel.builder()
                        .hotelName(dto.getHotelName())
                        .hotelId(UUID.randomUUID().toString())
                        .starRating(dto.getStarRating())
                        .description(byteCodeHandler.stringToBlob(dto.getDescription()))
                        .createdAt(LocalDateTime.now())
                        .updatedAt(LocalDateTime.now())
                        .activeStatus(true)
                        .startingFrom(dto.getStartingFrom())
                        .build();
    }

    private ResponseHotelDto toResponseHotelDto(Hotel hotel) throws SQLException {
        return hotel==null?null:
                ResponseHotelDto.builder()
                        .hotelId(hotel.getHotelId())
                        .hotelName(hotel.getHotelName())
                        .activeStatus(hotel.isActiveStatus())
                        .startingFrom(hotel.getStartingFrom())
                        .updatedAt(LocalDateTime.now())
                        .createdAt(LocalDateTime.now())
                        .description(byteCodeHandler.blobToString(hotel.getDescription()))
                        .build();
    }
}
