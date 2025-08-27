package com.Kranix.hotel_management_api.dto.request;

import com.Kranix.hotel_management_api.Enums.BranchType;
import com.Kranix.hotel_management_api.entity.Address;
import com.Kranix.hotel_management_api.entity.Hotel;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestBranchDto {

    private int roomCount;
    private BranchType branchType;
    private String branchName;
    private String hotelId;

}
