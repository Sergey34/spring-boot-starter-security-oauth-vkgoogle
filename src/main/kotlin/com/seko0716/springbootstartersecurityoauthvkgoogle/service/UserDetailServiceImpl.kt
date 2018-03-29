package com.seko0716.springbootstartersecurityoauthvkgoogle.service

import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import com.seko0716.springbootstartersecurityoauthvkgoogle.repository.UserRepository

class UserDetailServiceImpl(private var userRepository: UserRepository) : UserDetailsService {
    override fun loadUserByUsername(username: String): UserDetails? {
        val user = userRepository.findOneByLogin(username)
        return if (user != null) {
            UserDetailImpl(user)
        } else throw UsernameNotFoundException("Person Not Founded")
    }
}