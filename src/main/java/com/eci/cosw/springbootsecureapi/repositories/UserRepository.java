package com.eci.cosw.springbootsecureapi.repositories;

import com.eci.cosw.springbootsecureapi.model.KeyWords;
import com.eci.cosw.springbootsecureapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {


    @Query("SELECT u from User u where u.category.name=?1")
    public List<User> getUsersByCategory(String category);

    @Query("SELECT u.keyWords from User u where u.username=?1")
    public List<KeyWords> getKeyWordsBySite(String siteName);
}
