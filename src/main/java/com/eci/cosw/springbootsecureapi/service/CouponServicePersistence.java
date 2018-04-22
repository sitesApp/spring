package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Coupon;
import com.eci.cosw.springbootsecureapi.repositories.CouponRepository;
import com.eci.cosw.springbootsecureapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CouponServicePersistence implements CouponService{

    @Autowired
    CouponRepository couprepo;

    @Override
    public List<Coupon> getCouponsByUsername(String username) {
        return couprepo.getCouponsBySiteName(username);
    }

    @Override
    public List<Coupon> getCouponsMorePopular() {
        List<Coupon> resp = new ArrayList<>();
        List<Coupon> temp = couprepo.getCouponsMorePopular();
        resp.add(temp.get(0));
        resp.add(temp.get(1));
        resp.add(temp.get(2));
        return resp;
    }

    @Override
    public Coupon getCoupon(String siteUsername, String couponName) {
        return couprepo.getCoupon(siteUsername, couponName);
    }

    @Override
    public List<Coupon> getAllCoupons() {
        return couprepo.findAll();
    }
}
