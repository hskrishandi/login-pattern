package com.hskris.login_pattern.auth

import com.hskris.login_pattern.data.user.User
import com.hskris.login_pattern.data.user.UserDAO
import com.hskris.login_pattern.data.user.UserDAOImpl

class Auth {

    companion object {

        var username: String? = null

        private val userDAO: UserDAO = UserDAOImpl()

        fun login(username: String, password: String): Boolean {
            val user = userDAO.fetch(username)

            if(user != null){
                if(user.password == password){
                    this.username = user.username
                    return true
                }
            }
            return false
        }

    }

}