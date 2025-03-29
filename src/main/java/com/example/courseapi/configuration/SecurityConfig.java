package com.example.courseapi.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity


public class SecurityConfig  {
@Bean

    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return  http
                .csrf(csrf->csrf.disable())
    .authorizeHttpRequests(request ->
                request.requestMatchers("/","/getAll","/course/addCourse")
                        .permitAll()
                        .anyRequest().authenticated())
                .httpBasic(Customizer.withDefaults())
                .formLogin(Customizer.withDefaults())
                .build();
    }
}
