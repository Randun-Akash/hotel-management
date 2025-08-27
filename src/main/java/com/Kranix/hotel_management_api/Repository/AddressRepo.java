package com.Kranix.hotel_management_api.Repository;

import com.Kranix.hotel_management_api.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,String> {
}
