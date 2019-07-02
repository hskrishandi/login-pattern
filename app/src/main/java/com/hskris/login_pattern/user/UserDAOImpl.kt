package com.hskris.login_pattern.user

class UserDAOImpl : UserDAO {

    private val users: MutableList<User> = mutableListOf()

    init {
        val userList = users.toMutableList()
        userList.add(User("hans", "1234"))
        userList.add(User("rico", "1234"))
    }

    override fun add(user: User) {
        users.add(user)
    }

    override fun fetch(username: String): User? {
    }

    override fun delete(username: String) {

    }

}