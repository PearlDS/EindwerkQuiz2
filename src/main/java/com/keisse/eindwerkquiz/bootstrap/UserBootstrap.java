package com.keisse.eindwerkquiz.bootstrap;

import com.keisse.eindwerkquiz.models.Room;
import com.keisse.eindwerkquiz.models.User;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Component
public class UserBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    @Transactional
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
//        List<User> players = new ArrayList<>();
//
//        User user1 = new User();
//        User user2 = new User();
//        User user3 = new User();
//
//        user1.setUserName("Florian");
//        user2.setUserName("Delorian");
//        user3.setUserName("Begorian");
//
//        players.add(user1);
//        players.add(user2);
//        players.add(user3);
//
//        Room room = new Room();
//
//
//        room.setId(42069L);
//        room.setUsers(players);
//        QuizQuestion quizQuestion = new QuizQuestion();
    }
}
