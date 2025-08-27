package com.Kranix.hotel_management_api.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestFacilityDto {

    private String name;
    private String roomId;
}
