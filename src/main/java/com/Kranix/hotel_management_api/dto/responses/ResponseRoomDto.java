package com.Kranix.hotel_management_api.dto.responses;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseRoomDto {

    private String roomId;
    private int bedCount;
    private boolean isAvailable;
    private BigDecimal price;
    private String roomNumber;
    private String roomType;
    private String branchId;
    //facilities
    private List<ResponseFacilityDto> facilities;
    //room images
    private List<ResponseRoomImageDto> images;
}
