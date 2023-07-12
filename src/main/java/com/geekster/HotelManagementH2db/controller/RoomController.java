package com.geekster.HotelManagementH2db.controller;

import com.geekster.HotelManagementH2db.model.HotelRoom;
import com.geekster.HotelManagementH2db.model.Type;
import com.geekster.HotelManagementH2db.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@RestController
public class RoomController {
    @Autowired
    RoomService roomService;

    @PostMapping("room")  //create a hotel_room
    public String addRoom(@RequestBody HotelRoom room){
        return roomService.addRoom(room);
    }
    @PostMapping("rooms")  //create some hotel_rooms
    public String addRooms(@RequestBody List<HotelRoom> rooms){
        return roomService.addRooms(rooms);
    }

    @GetMapping("rooms")   //Find All hotel rooms
    public List<HotelRoom> getAllRooms(){
        return roomService.getAllRooms();
    }

    @GetMapping("room/id/{roomId}") // Find a room with its id
    public HotelRoom getRoomById(@PathVariable Long roomId){
        return roomService.getRoomById(roomId);
    }

    @GetMapping("room/{id}/exists")  //check whether the id exist or not
    public boolean isRoomExists(@PathVariable Long id){
        return roomService.isRoomExists(id);
    }
    @GetMapping("rooms/count") //Find the total counts of rooms
    public Long roomsCount(){
        return roomService.roomsCount();
    }

    @GetMapping("rooms/id/list") // Find rooms with its ids
    public Iterable<HotelRoom> getRoomsById(@RequestBody List<Long> roomIds){
        return roomService.getRoomsById(roomIds);
    }

    @DeleteMapping("room/id/{id}") // Delete the room by its id.
    public String deleteRoomById(@PathVariable Long id){
        return roomService.deleteRoomById(id);
    }

    @PutMapping("room/id/{id}/type/{type}") // Update the room_type by its id.
    public String updateRoomTypeById(@PathVariable Long id,@PathVariable Type type){
        return roomService.updateRoomTypeById(id,type);
    }

    //CUSTOM FINDERS (GET METHODS)

    @GetMapping("rooms/status/{roomStatus}") //get all rooms by its status
    public List<HotelRoom> getRoomsByStatus(@PathVariable Boolean roomStatus){
        return roomService.getRoomsByStatus(roomStatus);
    }
    @GetMapping("rooms/type/{roomType}/status/{roomStatus}")  //get all rooms by its type and status
    public List<HotelRoom> getRoomsByTypeAndStatus(@PathVariable Type roomType,@PathVariable Boolean roomStatus){
        return roomService.getRoomsByTypeAndStatus(roomType,roomStatus);
    }
    @GetMapping("rooms/type/{roomType}/status/{roomStatus}/range") //get all rooms by its type and status between the range of prices.
    public List<HotelRoom> getRoomsByStatusAndTypeAndPrice(@PathVariable Type roomType,@PathVariable Boolean roomStatus,@RequestParam Double lLimit,@RequestParam Double uLimit){
        return roomService.getRoomsByStatusAndTypeAndPrice(roomType,roomStatus,lLimit,uLimit);
    }
    @GetMapping("rooms/type/{roomType}")  //get all rooms by its type and sorted decreasing order by price
    public List<HotelRoom> getRoomsByTypeSortedByPrice(@PathVariable Type roomType){
        return roomService.getRoomsByTypeSortedByPrice(roomType);
    }
    @GetMapping("rooms/types/{roomType1}/{roomType2}") //get all rooms by type and price range or another type.
    public List<HotelRoom> getRoomsByTypeAndPriceOrType(@PathVariable Type roomType1,@PathVariable Type roomType2,@RequestParam Double lLimit,@RequestParam Double uLimit){
        return roomService.getRoomsByTypeAndPriceOrType(roomType1,roomType2,lLimit,uLimit);
    }

}
