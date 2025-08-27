package com.Kranix.hotel_management_api.Repository;

import com.Kranix.hotel_management_api.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepo extends JpaRepository<Room,String> {
}
