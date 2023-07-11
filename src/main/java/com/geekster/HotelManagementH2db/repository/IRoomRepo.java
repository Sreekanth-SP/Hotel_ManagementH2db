package com.geekster.HotelManagementH2db.repository;

import com.geekster.HotelManagementH2db.model.HotelRoom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoomRepo extends CrudRepository<HotelRoom,Long> {

}
