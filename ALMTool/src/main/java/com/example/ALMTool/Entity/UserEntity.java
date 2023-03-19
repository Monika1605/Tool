package com.example.ALMTool.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "usertable")
public class UserEntity {



    @Id
    @Column(name = "user_id")
    private int user_id;
    @Column(name = "user_name")
    private String user_name;
    @Column(name = "user_pass")
    private String user_pass;

    @ManyToOne
    private TeamEntity teamEntity;


    public UserEntity() {
    }

    public UserEntity(int user_id,String user_name,String user_pass) {
        this.user_id=user_id;
        this.user_name=user_name;
        this.user_pass=user_pass;
    }

    public int getuser_id() {
        return user_id;
    }

    public void setuser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setuser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getuser_pass() {
        return user_pass;
    }

    public void setuser_pass(String user_pass) {
        this.user_pass=user_pass;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_pass=" + user_pass +
                '}';
    }
}
