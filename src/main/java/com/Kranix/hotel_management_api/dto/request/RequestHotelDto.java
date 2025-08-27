package com.Kranix.hotel_management_api.dto.request;

import lombok.*;

import java.math.BigDecimal;
import java.sql.Blob;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestHotelDto {

    private String hotelName;
    private int starRating;
    private String description;
    private BigDecimal startingFrom;

}
