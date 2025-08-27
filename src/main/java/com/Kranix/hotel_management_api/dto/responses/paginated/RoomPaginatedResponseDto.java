package com.Kranix.hotel_management_api.dto.responses.paginated;

import com.Kranix.hotel_management_api.dto.responses.ResponseRoomDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoomPaginatedResponseDto {

    private List<ResponseRoomDto> datalist;
    private Long dataCount;
}
