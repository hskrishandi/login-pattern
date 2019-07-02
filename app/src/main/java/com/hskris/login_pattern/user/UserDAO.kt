package com.hskris.login_pattern.user

interface UserDAO {

    fun add(user: User)
    fun fetch(username: String): User?
    fun delete(username: String)

}