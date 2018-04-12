package com.eci.cosw.springbootsecureapi.model;

import java.util.List;

/**
 */
public class User {


    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private int cel1;
    private int cel2;
    private String username;
    private String logo;
    private String companyName;
    private String companyAddres;
    private String category;
    private List<Coupon> coupons;
    private String linkFacebook;
    private String linkInstagram;

    public User() {
    }

    public User(String username, String email, String password, String firstname, String lastname, String logo,
                String companyName, String companyAddres, String category, List<Coupon> coupons, int cel1, int cel2,
                String linkFacebook, String linkInstagram) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.logo = logo;
        this.companyName = companyName;
        this.companyAddres = companyAddres;
        this.category = category;
        this.coupons = coupons;
        this.cel1 = cel1;
        this.cel2 = cel2;
        this.linkFacebook=linkFacebook;
        this.linkInstagram=linkInstagram;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddres() {
        return companyAddres;
    }

    public void setCompanyAddres(String companyAddres) {
        this.companyAddres = companyAddres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Coupon> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<Coupon> coupons) {
        this.coupons = coupons;
    }


    public int getCel1() {
        return cel1;
    }

    public void setCel1(int cel1) {
        this.cel1 = cel1;
    }

    public int getCel2() {
        return cel2;
    }

    public void setCel2(int cel2) {
        this.cel2 = cel2;
    }

    public String getLinkFacebook() {
        return linkFacebook;
    }

    public void setLinkFacebook(String linkFacebook) {
        this.linkFacebook = linkFacebook;
    }

    public String getLinkInstagram() {
        return linkInstagram;
    }

    public void setLinkInstagram(String linkInstagram) {
        this.linkInstagram = linkInstagram;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
