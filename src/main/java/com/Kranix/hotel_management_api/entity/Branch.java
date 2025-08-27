package com.Kranix.hotel_management_api.entity;

import com.Kranix.hotel_management_api.Enums.BranchType;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Branch")
public class Branch {

    @Id
    @Column(name = "branch_id",length = 80)
    private String branchId;

    @Column(name = "room_count" )
    private int roomCount;

    @Enumerated(EnumType.STRING)
    @Column(name = "branch_type", nullable = false )
    private BranchType branchType;

    @Column(name = "branch_name" , nullable = false)
    private String branchName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    @OneToOne(mappedBy = "branch")
    private Address address;

    @OneToMany(mappedBy = "branch")
    private List<Room> rooms;
}
