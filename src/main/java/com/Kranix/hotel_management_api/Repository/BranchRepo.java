package com.Kranix.hotel_management_api.Repository;

import com.Kranix.hotel_management_api.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepo extends JpaRepository<Branch,String> {
}
