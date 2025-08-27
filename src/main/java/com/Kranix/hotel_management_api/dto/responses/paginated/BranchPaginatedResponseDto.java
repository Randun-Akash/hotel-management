package com.Kranix.hotel_management_api.dto.responses.paginated;

import com.Kranix.hotel_management_api.dto.responses.ResponseBranchDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BranchPaginatedResponseDto {

    private List<ResponseBranchDto> datalist;
    private Long dataCount;
}
