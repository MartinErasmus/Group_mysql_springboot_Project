package com.example.prg381_final_project.studentLogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Bean
    public studentLoginService studentLoginService(){
        return  new studentLoginService();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
   public DaoAuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(studentLoginService());
        authenticationProvider.setPasswordEncoder(passwordEncoder());
        return authenticationProvider;
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws  Exception{
        auth.authenticationProvider(authenticationProvider());
    }

    @Override
    public void configure(HttpSecurity http) throws  Exception{
        http.authorizeRequests().antMatchers("/adminPage").authenticated().anyRequest().permitAll()
                .and().formLogin().usernameParameter("email").defaultSuccessUrl("/adminPage").permitAll().and().logout()
                .logoutSuccessUrl("/").permitAll();
    }
}
