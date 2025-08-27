package com.Kranix.hotel_management_api.dto.responses;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseBranchDto {

    private String branchId;
    private String branchName;
    private String branchType;
    private int roomCount;
    private String hotelId;

}
