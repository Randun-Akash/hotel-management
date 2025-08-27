package com.Kranix.hotel_management_api.Repository;

import com.Kranix.hotel_management_api.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepo extends JpaRepository<Hotel,String> {
}
