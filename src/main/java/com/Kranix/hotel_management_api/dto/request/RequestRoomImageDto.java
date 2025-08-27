package com.Kranix.hotel_management_api.dto.request;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestRoomImageDto {

    private MultipartFile file;
    private String roomId;
}
