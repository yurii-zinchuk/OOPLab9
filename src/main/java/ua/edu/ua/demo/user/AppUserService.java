package ua.edu.ua.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppUserService {
    private final AppUserRepository userRepository;

    @Autowired
    public AppUserService(AppUserRepository userRepository) {this.userRepository = userRepository;}

    public List<AppUser> getUsers() {
        return userRepository.findAll();
    }

    public void addUser(AppUser user) {
        Optional<AppUser> appUser = userRepository.findAppUserByEmail(user.getEmail());
        if (appUser.isEmpty()) {userRepository.save(user);}
    }
}
