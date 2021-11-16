package com.keisse.eindwerkquiz.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Room {

    @Id
    private Long id;

    @OneToMany
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Room() {
    }

    public Room(List<User> users) {
        this.users = users;
    }
}
