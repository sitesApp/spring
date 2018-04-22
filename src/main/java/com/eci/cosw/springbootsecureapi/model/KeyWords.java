package com.eci.cosw.springbootsecureapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "keyWords" )
public class KeyWords {

    private String keyWord;
    private List<User> userList;

    public KeyWords() {
    }

    public KeyWords(String keyWord, List<User> userList) {

        this.keyWord = keyWord;
        this.userList = userList;
    }




    @Id
    @Column(name = "keyWord", nullable = false)
    public String getKeyWords() {
        return keyWord;
    }

    public void setKeyWords(String keyWords) {
        this.keyWord = keyWords;
    }


    @ManyToMany(mappedBy="keyWords",fetch= FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnore
    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
