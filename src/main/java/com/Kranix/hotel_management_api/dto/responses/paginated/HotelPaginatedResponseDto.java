package com.Kranix.hotel_management_api.dto.responses.paginated;

import com.Kranix.hotel_management_api.dto.responses.ResponseHotelDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HotelPaginatedResponseDto {

    private List<ResponseHotelDto> datalist;
    private Long dataCount;
}
