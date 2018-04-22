package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.KeyWords;
import com.eci.cosw.springbootsecureapi.model.User;
import com.eci.cosw.springbootsecureapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServicePersistence implements UserService {

    @Autowired
    UserRepository userrepo;

    @Override
    public List<User> getUsers() {
        return userrepo.findAll();
    }

    @Override
    public User getUser(String username) {
        return userrepo.findOne(username);
    }

    @Override
    public List<User> getUserByCategory(String category) {
        return userrepo.getUsersByCategory(category);
    }

    @Override
    public List<User> searchSite(String siteName, String townName) {

        List<User> users = userrepo.findAll();

        List<User> searchUsers = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            String a = users.get(i).getCompanyName();
            String b = a.toLowerCase();
            siteName.toLowerCase();
            if (siteName.equals("null")) {
                if (townName.equals(users.get(i).getTown().getName())) {
                    searchUsers.add(users.get(i));
                }
            }
            if (townName.equals("all")) {
                if (b.contains(siteName.toLowerCase())) {
                    searchUsers.add(users.get(i));
                }
            } else {
                if (b.contains(siteName.toLowerCase()) && townName.equals(users.get(i).getTown().getName())) {
                    searchUsers.add(users.get(i));
                }
            }

        }

        for (int i = 0; i < users.size(); i++) {
            List<KeyWords> a = users.get(i).getKeyWords();
            for (int j = 0; j < a.size(); j++) {

                if (townName.equals("all")) {
                    if (a.get(j).getKeyWords().toLowerCase().contains(siteName.toLowerCase())) {
                        searchUsers.add(users.get(i));
                    }
                } else {
                    if (a.get(j).getKeyWords().toLowerCase().contains(siteName.toLowerCase()) && townName.equals(users.get(i).getTown().getName())) {
                        searchUsers.add(users.get(i));
                    }
                }


            }
        }

        return searchUsers;

    }

    @Override
    public User getSite(String siteName) {
        return userrepo.findOne(siteName);
    }

    @Override
    public User createUser(User user) {
        return userrepo.save(user);
    }

    @Override
    public User findUserByEmail(String email) {
        return null;
    }

    @Override
    public User findUserByEmailAndPassword(String email, String password) {
        return null;
    }
}
