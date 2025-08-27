package com.Kranix.hotel_management_api.dto.responses;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseAddressDto {

    private String addressLine;
    private String city;
    private String country;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String branchId;

}
