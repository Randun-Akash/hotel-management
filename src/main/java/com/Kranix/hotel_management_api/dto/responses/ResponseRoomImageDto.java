package com.Kranix.hotel_management_api.dto.responses;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseRoomImageDto {

    private Long id;
    private String directory;
    private String fileName;
    private String hash;
    private String resourceUrl;
    private String roomId;


}
