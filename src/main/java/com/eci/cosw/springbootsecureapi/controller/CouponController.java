package com.eci.cosw.springbootsecureapi.controller;


import com.eci.cosw.springbootsecureapi.model.Coupon;
import com.eci.cosw.springbootsecureapi.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "user" )
public class CouponController {

    @Autowired
    private CouponService couponService;


    @CrossOrigin
    @RequestMapping( value = "/getCoupons/{siteUsername}", method = RequestMethod.GET )
    public List<Coupon> getCouponsByUsername(@PathVariable String siteUsername) {

        return couponService.getCouponsByUsername(siteUsername);
    }

    @CrossOrigin
    @RequestMapping( value = "/getAllCoupons", method = RequestMethod.GET )
    public List<Coupon> getAllCoupons() {

        return couponService.getAllCoupons();
    }

    @CrossOrigin
    @RequestMapping( value = "/getCouponsMorePopular", method = RequestMethod.GET )
    public List<Coupon> getCouponsMorePopular() {
        return couponService.getCouponsMorePopular();
    }

    @CrossOrigin
    @RequestMapping( value = "/getCoupon/{siteUsername}/{couponName}", method = RequestMethod.GET )
    public Coupon getCoupon(@PathVariable String siteUsername, @PathVariable String couponName) {
        return couponService.getCoupon(siteUsername, couponName);
    }

}
