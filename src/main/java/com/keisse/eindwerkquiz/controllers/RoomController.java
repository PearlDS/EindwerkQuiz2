package com.keisse.eindwerkquiz.controllers;

import com.keisse.eindwerkquiz.models.Room;
import com.keisse.eindwerkquiz.services.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//todo: controller mapping

@Controller
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService){
        this.roomService = roomService;
    }

    @RequestMapping("/")
    public String viewRooms(Model model) {
        List<Room> rooms = roomService.findAll();
        model.addAttribute("rooms", rooms);
        return "index";
    }

    @RequestMapping("/new")
    public String newRooms(Model model) {
        Room room = new Room();
        model.addAttribute(room);
        return "new_room";
    }

    @PostMapping("save")
    public String saveRoom(@ModelAttribute("room") Room room) {
        roomService.save(room);
        return "redirect:/";
    }

    @RequestMapping("edit/{id}")
    public String showEditRooms(@PathVariable(name = "id") Long id, Model model) {
        model.addAttribute("rooms", roomService.findById(id));
        return "edit_rooms";
    }

    @RequestMapping("delete/{id}")
    public String deleteRooms(@PathVariable(name = "id") Long id) {
        roomService.deleteById(id);
        return "redirect:/";
    }
}
