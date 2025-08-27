package com.Kranix.hotel_management_api.dto.responses;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseFacilityDto {

    private Long id;
    private String name;
    private String roomId;
}
