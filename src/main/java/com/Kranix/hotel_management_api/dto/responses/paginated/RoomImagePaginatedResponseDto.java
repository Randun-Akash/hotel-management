package com.Kranix.hotel_management_api.dto.responses.paginated;

import com.Kranix.hotel_management_api.dto.responses.ResponseRoomImageDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoomImagePaginatedResponseDto {

    private List<ResponseRoomImageDto> datalist;
    private Long dataCount;
}
