package com.eci.cosw.springbootsecureapi.model;

import java.math.BigDecimal;

public class Coupon {

    String name;
    Integer lastPrice;
    Integer newPrice;
    int discountRate;
    String image;
    String description;
    String smallLetters;
    int numberOfDownloads;

    public Coupon(String name, Integer lastPrice, Integer newPrice, int discountRate, String image, String description,
                  String smallLetters, int numberOfDownloads) {
        this.name = name;
        this.lastPrice = lastPrice;
        this.newPrice = newPrice;
        this.discountRate = discountRate;
        this.image = image;
        this.description = description;
        this.smallLetters = smallLetters;
        this.numberOfDownloads=numberOfDownloads;
    }

    public Coupon(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(Integer lastPrice) {
        this.lastPrice = lastPrice;
    }

    public Integer getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(Integer newPrice) {
        this.newPrice = newPrice;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSmallLetters() {
        return smallLetters;
    }

    public void setSmallLetters(String smallLetters) {
        this.smallLetters = smallLetters;
    }

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
