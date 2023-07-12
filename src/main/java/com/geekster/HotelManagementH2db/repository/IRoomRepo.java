package com.geekster.HotelManagementH2db.repository;

import com.geekster.HotelManagementH2db.model.HotelRoom;
import com.geekster.HotelManagementH2db.model.Type;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRoomRepo extends CrudRepository<HotelRoom,Long> {

    List<HotelRoom> findByRoomStatus(Boolean roomStatus);

    List<HotelRoom> findByRoomTypeAndRoomStatus(Type roomType, Boolean roomStatus);

    List<HotelRoom> findByRoomTypeAndRoomStatusAndRoomPriceGreaterThanAndRoomPriceLessThan(Type roomType, Boolean roomStatus, Double lLimit, Double uLimit);

    List<HotelRoom> findByRoomTypeOrderByRoomPriceDesc(Type roomType);

    List<HotelRoom> findByRoomTypeAndRoomPriceBetweenOrRoomType(Type roomType1, Double lLimit, Double uLimit, Type roomType2);
}
