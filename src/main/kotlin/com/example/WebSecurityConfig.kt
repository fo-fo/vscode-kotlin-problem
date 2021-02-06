package com.example

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@Configuration
@EnableWebSecurity
open class WebSecurityConfig : WebSecurityConfigurerAdapter() {
  @Throws(Exception::class)
  override fun configure(http: HttpSecurity) {
    http.authorizeRequests().anyRequest().permitAll()
  }
}
