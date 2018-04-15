package com.eci.cosw.springbootsecureapi.controller;

import com.eci.cosw.springbootsecureapi.model.Coupon;
import com.eci.cosw.springbootsecureapi.model.User;
import com.eci.cosw.springbootsecureapi.service.UserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import java.util.Date;
import java.util.List;

/**
 */
@RestController
@RequestMapping( "user" )
public class UserController
{

    @Autowired
    private UserService userService;

    @CrossOrigin
    @RequestMapping( value = "/getAll", method = RequestMethod.GET )
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @CrossOrigin
    @RequestMapping( value = "/search/{siteName}", method = RequestMethod.GET )
    public List<User> searchSite(@PathVariable String siteName) {
        return userService.searchSite(siteName);
    }

    @CrossOrigin
    @RequestMapping( value = "/getsite/{siteName}", method = RequestMethod.GET )
    public User getSite(@PathVariable String siteName) {
        return userService.getSite(siteName);
    }

    @CrossOrigin
    @RequestMapping( value = "/getCoupons/{siteUsername}", method = RequestMethod.GET )
    public List<Coupon> getCouponsByUsername(@PathVariable String siteUsername) {
        return userService.getCouponsByUsername(siteUsername);
    }

    @CrossOrigin
    @RequestMapping( value = "/getCoupon/{siteUsername}/{couponName}", method = RequestMethod.GET )
    public Coupon getCoupon(@PathVariable String siteUsername, @PathVariable String couponName) {
        return userService.getCoupon(siteUsername, couponName);
    }

    @CrossOrigin
    @RequestMapping( value = "/byCategory/{category}", method = RequestMethod.GET )
    public List<User> getUsersByCategory(@PathVariable String category) {
        return userService.getUserByCategory(category);
    }

    @CrossOrigin
    @RequestMapping( value = "/login", method = RequestMethod.POST )
    public ResponseEntity<?> login(@RequestBody User login ) {


        String jwtToken = "";

        if ( login.getUsername() == null || login.getPassword() == null )
        {
            return new ResponseEntity<>( "Please fill in username and password", HttpStatus.FORBIDDEN );
        }

        String username = login.getUsername();
        String password = login.getPassword();

        User user = userService.getUser( username );

        if ( user == null )
        {
            return new ResponseEntity<>( "User username not found.", HttpStatus.FORBIDDEN );
        }

        String pwd = user.getPassword();

        if ( !password.equals( pwd ) )
        {
            return new ResponseEntity<>( "Invalid login. Please check your name and password.", HttpStatus.FORBIDDEN );
        }

        jwtToken = Jwts.builder().setSubject( username ).claim( "roles", "user" ).setIssuedAt( new Date() ).signWith(
            SignatureAlgorithm.HS256, "secretkey" ).compact();
        return new ResponseEntity<>( new Token (jwtToken) ,HttpStatus.ACCEPTED);
    }

    public class Token
    {

        String access_token;


        public Token( String access_token )
        {
            this.access_token = access_token;
        }


        public String getAccessToken()
        {
            return access_token;
        }

        public void setAccessToken( String access_token )
        {
            this.access_token = access_token;
        }
    }

}
