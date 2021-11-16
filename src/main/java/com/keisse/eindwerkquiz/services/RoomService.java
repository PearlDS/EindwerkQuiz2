package com.keisse.eindwerkquiz.services;

import com.keisse.eindwerkquiz.models.Room;

import java.util.List;

public interface RoomService {

    List<Room> findAll();

    void save(Room room);

    Room findById(Long id);

    void deleteById(Long id);
}
