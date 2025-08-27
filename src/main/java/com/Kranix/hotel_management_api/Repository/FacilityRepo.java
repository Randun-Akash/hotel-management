package com.Kranix.hotel_management_api.Repository;

import com.Kranix.hotel_management_api.entity.Facility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilityRepo extends JpaRepository<Facility,String > {
}
