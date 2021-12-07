package com.keisse.eindwerkquiz.controllers;

import com.keisse.eindwerkquiz.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//todo: controller mapping

@Controller
//@RequestMapping("/playerConnection")
public class PlayersConnectionController {


//    private UserService userService;

    @GetMapping("/PlayerConnections")
    public String home(Model model) {

        return "index";
    }

//    @PostMapping("/PlayerConnection") //todo: fix dees
//    public String getTempUsers(Model model) {
//        List<User> users = userService.getTempUser();
//        model.addAttribute("users", users);
//        return "user";
//    }

//        @GetMapping("/GamePin") //todo: fix dees
//        public String roomId (Model model){
//
//        return "JoinRedirect";
//        }
//
//    private final RoomService roomService;
//
//    public RoomController(RoomService roomService){
//        this.roomService = roomService;
//    }
//
//    @RequestMapping("/")
//    public String viewRooms(Model model) {
//        List<Room> rooms = roomService.findAll();
//        model.addAttribute("rooms", rooms);
//        return "index";
//    }
//
//    @RequestMapping("/new")
//    public String newRooms(Model model) {
//        Room room = new Room();
//        model.addAttribute(room);
//        return "new_room";
//    }
//
//    @PostMapping("/save")
//    public String saveRoom(@ModelAttribute("room") Room room) {
//        roomService.save(room);
//        return "indexLoggedIn";
//    }
//
//    @RequestMapping("/edit/{id}")
//    public String showEditRooms(@PathVariable(name = "id") Long id, Model model) {
//        model.addAttribute("rooms", roomService.findById(id));
//        return "edit_rooms";
//    }

//    @RequestMapping("/delete/{id}")
//    public String deleteRooms(@PathVariable(name = "id") Long id) {
//        roomService.deleteById(id);
//        return "index";
//    }
    }
