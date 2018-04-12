package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Category;
import com.eci.cosw.springbootsecureapi.model.Coupon;
import com.eci.cosw.springbootsecureapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Santiago Carrillo
 * 8/21/17.
 */
@Service
public class UserServiceImpl
    implements UserService
{

    private List<User> users = new ArrayList<>();



    @Autowired
    public UserServiceImpl()
    {
    }

    @PostConstruct
    private void populateSampleData()
    {

        Coupon c = new Coupon( "Cupon prueba", 50000, 20000, 30, "/assets/category/restaurantes.jpg", "Obten un excelenete descuento en este plato", "Solo aplica a los primero 10 cupones redimidos");
        Coupon c1 = new Coupon( "Cupon prueba 2", 70000, 30000, 50, "/assets/category/cafeterias.jpg", "Obten un excelenete descuento en este pl adsfasd fa sdf adsf asd fa sdf as dfa sdf asdf asdfas df asdf asd ato", "Solo aplica a los primero 10 cupones redimidos");
        Coupon c2 = new Coupon( "Cupon prueba 3", 30000, 50000, 10, "/assets/category/restaurantes.jpg", "Obten un excelenete descuento en este plato", "Solo aplica a los primero 10 cupones redimidos");

        List<Coupon> couponList = new ArrayList<>();
        couponList.add(c);
        couponList.add(c1);
        couponList.add(c2);

        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/islamorada.png", "islamorada", "Carrera 10 # 20 - 5", "Restaurantes", couponList, 2312, 12312, "http://www.facebook.com", "http://www.instragram.com") );
        users.add( new User("avilla", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/cocheros.png", "Cocheros", "Calle 21", "Restaurantes",couponList, 2312, 12312, "http://www.facebook.com", "http://www.instragram.com") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/caw.png", "crepes and waffles", "Carrera 9", "Restaurantes",couponList, 2312, 12312, "http://www.facebook.com", "http://www.instragram.com") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/oma.png", "OMA", "Calle 21", "Cafeterias",couponList, 2312, 12312, "http://www.facebook.com", "http://www.instragram.com") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/juanv.png", "Juan Valdez", "Diagonal 10", "Cafeterias",couponList, 2312, 12312, "http://www.facebook.com", "http://www.instragram.com") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/islamorada.png", "islamorada", "Carrera 10 # 20 - 5", "Restaurantes",couponList, 2312, 12312, "http://www.facebook.com", "http://www.instragram.com") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/cocheros.png", "Cocheros", "Calle 21", "Restaurantes",couponList, 2312, 12312, "http://www.facebook.com", "http://www.instragram.com") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/paintlogo.png", "Paint Ball", "Carrera 10", "Paintball",couponList, 2312, 12312, "http://www.facebook.com", "http://www.instragram.com") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/barprueba.png", "Bar prueba", "Carrera 20", "Bares",couponList, 2312, 12312, "http://www.facebook.com", "http://www.instragram.com") );
    }


    @Override
    public List<User> getUsers()
    {
        return users;
    }

    @Override
    public User getUser( String usernamme )
    {
        int j = -1;
        for(int i=0;i<users.size();i++) {
            if(users.get(i).getUsername().equals(usernamme)){
                j = i;
            }
        }
        return users.get(j);


    }

    @Override
    public List<User> getUserByCategory(String category) {
        List<User> usersByCategory = new ArrayList<>();

        for(int i=0;i<users.size();i++) {
            if(users.get(i).getCategory().equals(category)){
                usersByCategory.add(users.get(i));
            }
        }
        return usersByCategory;


    }

    @Override
    public User getSite(String siteName) {
        int j = -1;
        for(int i=0;i<users.size();i++) {
            if(users.get(i).getCompanyName().equals(siteName)){
                j = i;
            }
        }
        return users.get(j);
    }

    @Override
    public User createUser( User user )
    {
        return users.get( 0 );
    }

    @Override
    public User findUserByEmail( String email )
    {
        return users.get( 0 );
    }

    @Override
    public User findUserByEmailAndPassword( String email, String password )
    {
        return users.get( 0 );
    }

    @Override
    public List<Coupon> getCouponsByUsername(String username) {
        int j = -1;
        for(int i=0;i<users.size();i++) {
            if(users.get(i).getUsername().equals(username)){
                j = i;
            }
        }
        return users.get(j).getCoupons();
    }

}
