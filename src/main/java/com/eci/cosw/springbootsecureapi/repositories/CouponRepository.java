package com.eci.cosw.springbootsecureapi.repositories;

import com.eci.cosw.springbootsecureapi.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CouponRepository extends JpaRepository<Coupon, String> {

    @Query("SELECT c from Coupon c where c.site.username=?1")
    public List<Coupon> getCouponsBySiteName(String username);

    @Query("SELECT c from Coupon c ORDER BY numberOfDownloads DESC")
    public List<Coupon> getCouponsMorePopular();

    @Query("SELECT c from Coupon c where c.site.username=?1 AND c.name=?2")
    public Coupon getCoupon(String siteUsermane, String couponName);
}
