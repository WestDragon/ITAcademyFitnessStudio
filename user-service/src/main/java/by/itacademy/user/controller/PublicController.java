package by.itacademy.user.controller;

import by.itacademy.user.controller.dto.LoginDto;
import by.itacademy.user.controller.utils.JwtTokenUtil;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicController {

    private final UserDetailsManager userManager;
    private final PasswordEncoder encoder;

    public PublicController(UserDetailsManager userManager,
                            PasswordEncoder encoder) {
        this.userManager = userManager;
        this.encoder = encoder;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody LoginDto loginDto){
        UserDetails details = userManager.loadUserByUsername(loginDto.getLogin());

        if(!encoder.matches(loginDto.getPassword(), details.getPassword())){
            throw new IllegalArgumentException("Пароль неверный");
        }

        return JwtTokenUtil.generateAccessToken(details);
    }

}
