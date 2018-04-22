package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Category;
import com.eci.cosw.springbootsecureapi.model.Coupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


public class CouponServiceImpl implements CouponService {


    List<Coupon> couponList2 = new ArrayList<>();

    @PostConstruct
    private void populateSampleData()
    {

    }

    @Override
    public List<Coupon> getCouponsByUsername(String username) {
        return null;
    }

    @Override
    public List<Coupon> getCouponsMorePopular() {
        return null;
    }

    @Override
    public Coupon getCoupon(String siteUsername, String couponName) {
        return null;
    }

    @Override
    public List<Coupon> getAllCoupons() {
        return null;
    }


    /*
    @Override
    public List<Coupon> getCouponsByUsername(String username) {

        User temp = null;
        for(int i=0;i<users.size();i++) {
            if(users.get(i).getUsername().equals(username)){
                temp = users.get(i);
            }
        }
        return temp.getCoupons();
    }

    @Override
    public List<Coupon> getCouponsMorePopular() {

        List<Coupon> allCoupons = new ArrayList<>();

        for(int i=0;i<users.size();i++) {
            List<Coupon> temp = users.get(i).getCoupons();
            for(int j=0;j<temp.size();j++) {
                allCoupons.add(temp.get(j));
            }
        }


        List<Coupon> couponListMorePopular = new ArrayList<>();
        int idEli = -1;
        for(int i=0;i<allCoupons.size();i++) {
           if(couponListMorePopular.size()==0){
               couponListMorePopular.add(allCoupons.get(i));
           }
           else{
               if(couponListMorePopular.get(0).getNumberOfDownloads()<allCoupons.get(i).getNumberOfDownloads()){
                   System.out.println("ENTRO");
                   System.out.println("Se elimina: "+allCoupons.get(i).getName()+" "+allCoupons.get(i).getNumberOfDownloads());
                   couponListMorePopular.clear();
                   couponListMorePopular.add(allCoupons.get(i));
                   idEli=i;
               }
           }
        }
        allCoupons.remove(idEli);

        for(int i=0;i<allCoupons.size();i++) {
            if(couponListMorePopular.size()==1){
                couponListMorePopular.add(allCoupons.get(i));
            }
            else{
                if(couponListMorePopular.get(1).getNumberOfDownloads()<allCoupons.get(i).getNumberOfDownloads()){
                    couponListMorePopular.remove(1);
                    couponListMorePopular.add(allCoupons.get(i));
                    idEli=i;
                }
            }
        }
        allCoupons.remove(idEli);

        for(int i=0;i<allCoupons.size();i++) {
            if(couponListMorePopular.size()==2){
                couponListMorePopular.add(allCoupons.get(i));
            }
            else{
                if(couponListMorePopular.get(2).getNumberOfDownloads()<allCoupons.get(i).getNumberOfDownloads()){
                    couponListMorePopular.remove(2);
                    couponListMorePopular.add(allCoupons.get(i));
                    idEli=i;
                }
            }
        }

        return couponListMorePopular;
    }


    @Override
    public Coupon getCoupon(String siteUsername, String couponName) {
        int j = -1;
        for(int i=0;i<users.size();i++) {
            if(users.get(i).getUsername().equals(siteUsername)){
                j = i;
            }
        }
        User temp = users.get(j);
        List<Coupon> couponList = temp.getCoupons();

        int k = -1;
        for(int l=0;l<couponList.size();l++) {
            if(couponList.get(l).getName().equals(couponName)){
                k = l;
            }
        }
        Coupon res = couponList.get(k);
        return res;
    }

     */
}
