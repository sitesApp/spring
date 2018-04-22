package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Coupon;

import java.util.List;

public interface CouponService {

    List<Coupon> getCouponsByUsername (String username);

    List<Coupon> getCouponsMorePopular ();

    Coupon getCoupon(String siteUsername, String couponName);

    List<Coupon> getAllCoupons();

}
