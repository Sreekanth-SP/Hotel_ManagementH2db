package com.geekster.HotelManagementH2db.service;

import com.geekster.HotelManagementH2db.model.HotelRoom;
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
}
