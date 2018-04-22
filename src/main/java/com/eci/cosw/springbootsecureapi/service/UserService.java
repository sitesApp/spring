package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Coupon;
import com.eci.cosw.springbootsecureapi.model.User;

import java.util.List;

/**
 * @author Santiago Carrillo
 * 8/21/17.
 */
public interface UserService
{
    List<User> getUsers();

    User getUser( String username );

    List<User> getUserByCategory (String category);

    List<User> searchSite (String siteName, String townName);

    User getSite(String siteName);

    User createUser( User user );

    User findUserByEmail( String email );

    User findUserByEmailAndPassword( String email, String password );

    List<Coupon> getCouponsByUsername (String username);

    List<Coupon> getCouponsMorePopular ();

    Coupon getCoupon(String siteUsername, String couponName);
}