package com.eci.cosw.springbootsecureapi.model;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

/**
 */
@Entity
@Table(name = "Site" )
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
    private Category category;
    private String linkFacebook;
    private String linkInstagram;
    private String schedule;
    private String linkTA;
    private String linkGoogleMaps;
    private List<KeyWords> keyWords;
    private Town town;

    public User() {
    }

    public User(String username, String email, String password, String firstname, String lastname, String logo,
                String companyName, String companyAddres, Category category, int cel1, int cel2,
                String linkFacebook, String linkInstagram, String schedule, String linkTA, String linkGoogleMaps,
                List<KeyWords> keyWords, Town town) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.logo = logo;
        this.companyName = companyName;
        this.companyAddres = companyAddres;
        this.category = category;
        this.cel1 = cel1;
        this.cel2 = cel2;
        this.linkFacebook=linkFacebook;
        this.linkInstagram=linkInstagram;
        this.schedule=schedule;
        this.linkTA=linkTA;
        this.linkGoogleMaps=linkGoogleMaps;
        this.keyWords=keyWords;
        this.town = town;
    }

    @ManyToOne(cascade=ALL)
    @JoinColumn(name="town_name", referencedColumnName="name", nullable=true)
    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Site_KeyWords",
            joinColumns =
            @JoinColumn(name="site_name", referencedColumnName="username"),
            inverseJoinColumns =
            @JoinColumn(name="keyWord_name", referencedColumnName="keyWord")
    )
    public List<KeyWords> getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(List<KeyWords> keyWords) {
        this.keyWords = keyWords;
    }

    @Column(name = "logo", nullable = false)
    public String getLogo() {
        return logo;
    }


    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Column(name = "companyName", nullable = false)
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Column(name = "companyAddres", nullable = false)
    public String getCompanyAddres() {
        return companyAddres;
    }

    public void setCompanyAddres(String companyAddres) {
        this.companyAddres = companyAddres;
    }

    @Column(name = "email", nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "password", nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "firstName", nullable = false)
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Column(name = "lastName", nullable = false)
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Id
    @Column(name = "username", nullable = false)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @ManyToOne(cascade=ALL)
    @JoinColumn(name="category_name", referencedColumnName="name", nullable=true)
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Column(name = "cel1", nullable = false)
    public int getCel1() {
        return cel1;
    }

    public void setCel1(int cel1) {
        this.cel1 = cel1;
    }

    @Column(name = "cel2", nullable = false)
    public int getCel2() {
        return cel2;
    }

    public void setCel2(int cel2) {
        this.cel2 = cel2;
    }

    @Column(name = "linkFacebook", nullable = false)
    public String getLinkFacebook() {
        return linkFacebook;
    }

    public void setLinkFacebook(String linkFacebook) {
        this.linkFacebook = linkFacebook;
    }

    @Column(name = "linkInstagram", nullable = false)
    public String getLinkInstagram() {
        return linkInstagram;
    }

    public void setLinkInstagram(String linkInstagram) {
        this.linkInstagram = linkInstagram;
    }

    @Column(name = "getSchedule", nullable = false)
    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Column(name = "linkTA", nullable = false)
    public String getLinkTA() {
        return linkTA;
    }

    public void setLinkTA(String linkTA) {
        this.linkTA = linkTA;
    }

    @Column(name = "linkGoogleMaps", nullable = false)
    public String getLinkGoogleMaps() {
        return linkGoogleMaps;
    }

    public void setLinkGoogleMaps(String linkGoogleMaps) {
        this.linkGoogleMaps = linkGoogleMaps;
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
