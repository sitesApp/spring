package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Santiago Carrillo
 * 8/21/17.
 */

public class UserServiceImpl
    implements UserService
{

    private List<User> users = new ArrayList<>();
    List<Coupon> couponList2 = new ArrayList<>();



    @Autowired
    public UserServiceImpl()
    {
    }

    @PostConstruct
    private void populateSampleData()
    {


    }


    @Override
    public List<User> getUsers()
    {
        return users;
    }

    @Override
    public User getUser( String usernamme )
    {
        int j = -1;
        for(int i=0;i<users.size();i++) {
            if(users.get(i).getUsername().equals(usernamme)){
                j = i;
            }
        }
        return users.get(j);


    }

    @Override
    public List<User> getUserByCategory(String category) {
        List<User> usersByCategory = new ArrayList<>();

        for(int i=0;i<users.size();i++) {
            if(users.get(i).getCategory().equals(category)){
                usersByCategory.add(users.get(i));
            }
        }


        return usersByCategory;


    }

    @Override
    public List<User> searchSite(String siteName, String townName) {
        List<User> searchUsers = new ArrayList<>();
        for(int i=0;i<users.size();i++) {
            String a = users.get(i).getCompanyName();
            String b= a.toLowerCase();
            siteName.toLowerCase();
            if (siteName.equals("null")){
                if(townName.equals(users.get(i).getTown().getName())){
                    searchUsers.add(users.get(i));
                }
            }
            if(townName.equals("all")){
                if(b.contains(siteName.toLowerCase())){
                    searchUsers.add(users.get(i));
                }
            }
            else{
                if(b.contains(siteName.toLowerCase()) && townName.equals(users.get(i).getTown().getName())){
                    searchUsers.add(users.get(i));
                }
            }

        }

        for(int i=0;i<users.size();i++) {
            List<KeyWords> a = users.get(i).getKeyWords();
            for (int j = 0; j < a.size() ; j++) {

                if (townName.equals("all")){
                    if(a.get(j).getKeyWords().toLowerCase().contains(siteName.toLowerCase())){
                        searchUsers.add(users.get(i));
                    }
                }
                else{
                    if(a.get(j).getKeyWords().toLowerCase().contains(siteName.toLowerCase()) && townName.equals(users.get(i).getTown().getName())){
                        searchUsers.add(users.get(i));
                    }
                }


            }
        }

        return searchUsers;
    }

    @Override
    public User getSite(String siteName) {
        int j = -1;
        for(int i=0;i<users.size();i++) {
            if(users.get(i).getCompanyName().equals(siteName)){
                j = i;
            }
        }
        return users.get(j);
    }

    @Override
    public User createUser( User user )
    {
        return users.get( 0 );
    }

    @Override
    public User findUserByEmail( String email )
    {
        return users.get( 0 );
    }

    @Override
    public User findUserByEmailAndPassword( String email, String password )
    {
        return users.get( 0 );
    }



}
