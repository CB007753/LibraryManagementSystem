package com.example.librarymanagementsystem.Service;

import com.example.librarymanagementsystem.Model.RegistrationDTO;
import com.example.librarymanagementsystem.Model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

//user detail service - used as DAO for user authentication
public interface UserService extends UserDetailsService {

    //to get user linked with the email provided
    User getUserByEmail(String email);

    //to save user to database- registration process
    User save(RegistrationDTO registrationDTO);

    void update(String blacklist, Long id);

    void saveOrUpdate(User user);

    //Admin- delete user by id
    void deleteFile(Long id);

    //to check whether the user entered pass is correct
    boolean passwordCheck(String pas_1, String pas_2);

    //to check whether the user linked with the email provided exists, returns true/false
    boolean CheckIfUserExists(String email);

}
