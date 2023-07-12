package com.geekster.HotelManagementH2db.service;

import com.geekster.HotelManagementH2db.model.HotelRoom;
import com.geekster.HotelManagementH2db.model.Type;
import com.geekster.HotelManagementH2db.repository.IRoomRepo;
import org.aspectj.bridge.IMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {
    @Autowired
    IRoomRepo iRoomRepo;

    public String addRoom(HotelRoom room) {
        iRoomRepo.save(room);
        return "One Room Added.";
    }

    public String addRooms(List<HotelRoom> rooms) {
        iRoomRepo.saveAll(rooms);
        return "All rooms added";
    }

    public List<HotelRoom> getAllRooms() {
        return (List<HotelRoom>) iRoomRepo.findAll();
    }

    public HotelRoom getRoomById(Long roomId) {
        Optional<HotelRoom> optionalHotelRoom= iRoomRepo.findById(roomId);
        return optionalHotelRoom.orElse(null);
    }

    public boolean isRoomExists(Long id) {
        return iRoomRepo.existsById(id);
    }

    public Long roomsCount() {
        return iRoomRepo.count();
    }

    public Iterable<HotelRoom> getRoomsById(List<Long> roomIds) {
        return  iRoomRepo.findAllById(roomIds);
    }

    public String deleteRoomById(Long id) {
        Optional<HotelRoom> optionalHotelRoom= iRoomRepo.findById(id);
        if(optionalHotelRoom.isPresent()) {
            iRoomRepo.deleteById(id);
            return "Room Deleted";
        }
        return "Room id Not Found :"+id;
    }

    public String updateRoomTypeById(Long id, Type type) {
        Optional<HotelRoom> roomOptional = iRoomRepo.findById(id);
        if(roomOptional.isEmpty())
            return "ID NOT FOUND: "+id;
        HotelRoom room = roomOptional.get();
        room.setRoomType(type);
        iRoomRepo.save(room);

        return"Updated";
    }

    public List<HotelRoom> getRoomsByStatus(Boolean roomStatus) {
        return iRoomRepo.findByRoomStatus(roomStatus);
    }

    public List<HotelRoom> getRoomsByTypeAndStatus(Type roomType, Boolean roomStatus) {
        return iRoomRepo.findByRoomTypeAndRoomStatus(roomType,roomStatus);
    }

    public List<HotelRoom> getRoomsByStatusAndTypeAndPrice(Type roomType, Boolean roomStatus, Double lLimit, Double uLimit) {
        return iRoomRepo.findByRoomTypeAndRoomStatusAndRoomPriceGreaterThanAndRoomPriceLessThan(roomType,roomStatus,lLimit,uLimit);
    }

    public List<HotelRoom> getRoomsByTypeSortedByPrice(Type roomType) {
        return iRoomRepo.findByRoomTypeOrderByRoomPriceDesc(roomType);
    }

    public List<HotelRoom> getRoomsByTypeAndPriceOrType(Type roomType1, Type roomType2, Double lLimit, Double uLimit) {
        return iRoomRepo.findByRoomTypeAndRoomPriceBetweenOrRoomType(roomType1,lLimit,uLimit,roomType2);
    }
}
