package com.Kranix.hotel_management_api.dto.responses.paginated;

import com.Kranix.hotel_management_api.dto.responses.ResponseAddressDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressPaginatedResponseDto {

    private List<ResponseAddressDto> datalist;
    private Long dataCount;
}
