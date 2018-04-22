package com.eci.cosw.springbootsecureapi.model;

import javax.persistence.*;
import java.math.BigDecimal;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "Coupons" )
public class Coupon {

    String code;
    String name;
    Integer lastPrice;
    Integer newPrice;
    int discountRate;
    String image;
    String description;
    String smallLetters;
    int numberOfDownloads;
    User site;

    public Coupon(){

    }


    public Coupon(String name, Integer lastPrice, Integer newPrice, int discountRate, String image, String description,
                  String smallLetters, int numberOfDownloads, User site, String code) {
        this.name = name;
        this.lastPrice = lastPrice;
        this.newPrice = newPrice;
        this.discountRate = discountRate;
        this.image = image;
        this.description = description;
        this.smallLetters = smallLetters;
        this.numberOfDownloads=numberOfDownloads;
        this.site=site;
        this.code=code;
    }

    @Id
    @Column(name = "code", nullable = false)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @ManyToOne(cascade=ALL)
    @JoinColumn(name="site_username", referencedColumnName="username", nullable=true)
    public User getSite() {
        return site;
    }

    public void setSite(User site) {
        this.site = site;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "lastPrice", nullable = false)
    public Integer getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(Integer lastPrice) {
        this.lastPrice = lastPrice;
    }

    @Column(name = "newPrice", nullable = false)
    public Integer getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(Integer newPrice) {
        this.newPrice = newPrice;
    }

    @Column(name = "discountRate", nullable = false)
    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    @Column(name = "image", nullable = false)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Column(name = "description", nullable = false)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "smallLetters", nullable = false)
    public String getSmallLetters() {
        return smallLetters;
    }

    public void setSmallLetters(String smallLetters) {
        this.smallLetters = smallLetters;
    }

    @Column(name = "numberOfDownloads", nullable = false)
    public int getNumberOfDownloads() {
        return numberOfDownloads;
    }

    public void setNumberOfDownloads(int numberOfDownloads) {
        this.numberOfDownloads = numberOfDownloads;
    }


    public int compareTo(Coupon comparestu) {
        int compareage=((Coupon)comparestu).getNumberOfDownloads();
        /* For Ascending order*/
        return this.getNumberOfDownloads()-compareage;

        /* For Descending order do like this */
        //return compareage-this.studentage;
    }
}
