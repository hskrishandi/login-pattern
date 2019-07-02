package com.hskris.login_pattern.data.user

class UserDAOImpl : UserDAO {

    private val users: MutableList<User> = mutableListOf()

    init {
        users.add(User("hans", "1234"))
        users.add(User("rico", "1234"))
    }

    override fun add(user: User) {
        users.add(user)
    }

    override fun fetch(username: String): User? {
        for(user in users){
            if(user.username == username)
                return user
        }

        return null
    }

    override fun delete(username: String) {

    }

}