package com.example.demo.users.repository

import com.example.demo.users.model.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Int>