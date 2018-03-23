package com.eci.cosw.springbootsecureapi.service;

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
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/islamorada.png", "islamorada", "Carrera 10 # 20 - 5") );
        users.add( new User("avilla", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/cocheros.png", "Cocheros", "Calle 21") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/caw.png", "crepes and waffles", "Carrera 9") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/oma.png", "OMA", "Calle 21") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/juanv.png", "Juan Valdez", "Diagonal 10") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/islamorada.png", "islamorada", "Carrera 10 # 20 - 5") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/cocheros.png", "Cocheros", "Calle 21") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/caw.png", "crepes and waffles", "Carrera 9") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/oma.png", "OMA", "Calle 21") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/juanv.png", "Juan Valdez", "Diagonal 10") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/islamorada.png", "islamorada", "Carrera 10 # 20 - 5") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/cocheros.png", "Cocheros", "Calle 21") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/caw.png", "crepes and waffles", "Carrera 9") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/oma.png", "OMA", "Calle 21") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/juanv.png", "Juan Valdez", "Diagonal 10") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/islamorada.png", "islamorada", "Carrera 10 # 20 - 5") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/cocheros.png", "Cocheros", "Calle 21") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/caw.png", "crepes and waffles", "Carrera 9") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/oma.png", "OMA", "Calle 21") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/juanv.png", "Juan Valdez", "Diagonal 10") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/islamorada.png", "islamorada", "Carrera 10 # 20 - 5") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/cocheros.png", "Cocheros", "Calle 21") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/caw.png", "crepes and waffles", "Carrera 9") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/oma.png", "OMA", "Calle 21") );
        users.add( new User("prueba", "test@mail.com", "1234", "Andres", "Perez", "/assets/images/juanv.png", "Juan Valdez", "Diagonal 10") );
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

}
