package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Category;
import com.eci.cosw.springbootsecureapi.model.Coupon;
import com.eci.cosw.springbootsecureapi.model.Town;
import com.eci.cosw.springbootsecureapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    List<Coupon> couponList2 = new ArrayList<>();



    @Autowired
    public UserServiceImpl()
    {
    }

    @PostConstruct
    private void populateSampleData()
    {

        Coupon c = new Coupon( "Cupon prueba", 50000, 20000, 30, "/assets/category/restaurantes.jpg", "Obten un excelenete descuento en este plato", "Solo aplica a los primero 10 cupones redimidos",2);
        Coupon c1 = new Coupon( "Cupon prueba 2", 70000, 30000, 50, "/assets/category/cafeterias.jpg", "Obten un excelenete descuento en este pl adsfasd fa sdf adsf asd fa sdf as dfa sdf asdf asdfas df asdf asd ato", "Solo aplica a los primero 10 cupones redimidos",0);
        Coupon c2 = new Coupon( "Cupon prueba 3", 30000, 50000, 10, "/assets/category/restaurantes.jpg", "Obten un excelenete descuento en este plato", "Solo aplica a los primero 10 cupones redimidos",5);
        Coupon c3 = new Coupon( "Cupon prueba 4", 70000, 30000, 50, "/assets/category/cafeterias.jpg", "Obten un excelenete descuento en este pl adsfasd fa sdf adsf asd fa sdf as dfa sdf asdf asdfas df asdf asd ato", "Solo aplica a los primero 10 cupones redimidos",0);
        Coupon c4 = new Coupon( "Cupon prueba 5", 30000, 50000, 10, "/assets/category/restaurantes.jpg", "Obten un excelenete descuento en este plato", "Solo aplica a los primero 10 cupones redimidos",7);
        Coupon c5 = new Coupon( "Cupon prueba 6", 70000, 30000, 50, "/assets/category/cafeterias.jpg", "Obten un excelenete descuento en este pl adsfasd fa sdf adsf asd fa sdf as dfa sdf asdf asdfas df asdf asd ato", "Solo aplica a los primero 10 cupones redimidos",0);
        Coupon c6 = new Coupon( "Cupon prueba", 50000, 20000, 30, "/assets/category/restaurantes.jpg", "Obten un excelenete descuento en este plato", "Solo aplica a los primero 10 cupones redimidos",20);


        List<Coupon> couponList1 = new ArrayList<>();
        List<Coupon> couponListVacia = new ArrayList<>();
        couponList1.add(c);
        couponList1.add(c1);
        couponList1.add(c2);

        List<Coupon> couponList2 = new ArrayList<>();
        couponList2.add(c3);
        couponList2.add(c4);
        couponList2.add(c5);


        List<Coupon> couponList3 = new ArrayList<>();
        couponList3.add(c6);


        String linkTripA = "https://www.tripadvisor.co/Restaurant_Review-g1725990-d2297760-Reviews-Islamorada-Sopo_Cundinamarca_Department.html";
        String linkGoogleMaps = "https://www.google.com/maps/embed/v1/place?q=place_id:ChIJa0YFT951QI4RGUEATe0KCjM&key=AIzaSyDN4V7-aX8Jm2tfKlxJb1vCF4jlCNrwS3U";


        List<String> kw = new ArrayList<>();
        kw.add("postres");
        kw.add("restaurantes");


        Town t1 = new Town("Cajicá");
        Town t2 = new Town("Chia");

        users.add( new User("islamorada", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/islamorada.png", "islamorada", "Carrera 10 # 20 - 5", "Restaurantes", couponList1, 2312, 12312, "http://www.facebook.com", "http://www.instragram.com","Horario: tal\nlunes/nmartes",linkTripA,linkGoogleMaps, kw,t1) );
        users.add( new User("cocheros", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/cocheros.png", "Cocheros", "Calle 21", "Restaurantes",couponList2, 2312, 12312, "http://www.facebook.com", "http://www.instragram.com","horario\ntal",linkTripA,linkGoogleMaps, kw, t1) );
        users.add( new User("crepes", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/caw.png", "crepes and waffles", "Carrera 9", "Restaurantes",couponList3, 2312, 12312, "http://www.facebook.com", "http://www.instragram.com","horario\ntal",linkTripA,linkGoogleMaps, kw,t1) );
        users.add( new User("oma", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/oma.png", "OMA", "Calle 21", "Cafeterias",couponListVacia, 2312, 12312, "http://www.facebook.com", "http://www.instragram.com","horario\ntal",linkTripA,linkGoogleMaps, kw,t1) );
        users.add( new User("jv", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/juanv.png", "Juan Valdez", "Diagonal 10", "Cafeterias",couponListVacia, 2312, 12312, "http://www.facebook.com", "http://www.instragram.com","horario\ntal",linkTripA,linkGoogleMaps, kw,t2) );
        users.add( new User("cocheritos", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/cocheros.png", "Cocheros", "Calle 21", "Restaurantes",couponListVacia, 2312, 12312, "http://www.facebook.com", "http://www.instragram.com","horario\ntal",linkTripA,linkGoogleMaps, kw, t2) );
        users.add( new User("painb", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/paintlogo.png", "Paint Ball", "Carrera 10", "Paintball",couponListVacia, 2312, 12312, "http://www.facebook.com", "http://www.instragram.com","horario\ntal",linkTripA,linkGoogleMaps, kw, t2) );
        users.add( new User("bar", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/barprueba.png", "Bar prueba", "Carrera 20", "Bares",couponListVacia, 2312, 12312, "http://www.facebook.com", "http://www.instragram.com","horario\ntal",linkTripA,linkGoogleMaps, kw, t2) );

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
    public List<User> searchSite(String siteName, String townName) {
        List<User> searchUsers = new ArrayList<>();
        for(int i=0;i<users.size();i++) {
            String a = users.get(i).getCompanyName();
            String b= a.toLowerCase();
            siteName.toLowerCase();
            if (siteName.equals("null")){
                if(townName.equals(users.get(i).getTown().getName())){
                    searchUsers.add(users.get(i));
                }
            }
            if(townName.equals("all")){
                if(b.contains(siteName.toLowerCase())){
                    searchUsers.add(users.get(i));
                }
            }
            else{
                if(b.contains(siteName.toLowerCase()) && townName.equals(users.get(i).getTown().getName())){
                    searchUsers.add(users.get(i));
                }
            }

        }

        for(int i=0;i<users.size();i++) {
            List<String> a = users.get(i).getKeyWords();
            for (int j = 0; j < a.size() ; j++) {

                if (townName.equals("all")){
                    if(a.get(j).toLowerCase().contains(siteName.toLowerCase())){
                        searchUsers.add(users.get(i));
                    }
                }
                else{
                    if(a.get(j).toLowerCase().contains(siteName.toLowerCase()) && townName.equals(users.get(i).getTown().getName())){
                        searchUsers.add(users.get(i));
                    }
                }


            }
        }

        return searchUsers;
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

}
