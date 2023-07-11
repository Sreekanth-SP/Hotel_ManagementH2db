package com.geekster.HotelManagementH2db.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Room") //Rename the table
public class HotelRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;

    @Column(unique = true)
    private Integer roomNumber;

    @Enumerated(EnumType.STRING)
    private Type roomType;

    private Double roomPrice;

    @Column(name = "status")
    private Boolean roomStatus;

}
