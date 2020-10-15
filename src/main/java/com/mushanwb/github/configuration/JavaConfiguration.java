package com.mushanwb.github.configuration;

import com.mushanwb.github.mapper.UserMapper;
import com.mushanwb.github.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {

    @Bean
    public UserService userService(UserMapper userMapper) {
        return new UserService(userMapper);
    }

}
