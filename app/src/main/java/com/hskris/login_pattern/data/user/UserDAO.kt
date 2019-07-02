package com.hskris.login_pattern.data.user

interface UserDAO {

    fun add(user: User)
    fun fetch(username: String): User?
    fun delete(username: String)

}