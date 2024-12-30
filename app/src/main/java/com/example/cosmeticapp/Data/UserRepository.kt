package com.example.yourapp.data

class UserRepository(private val userDao: UserDao) {
    suspend fun insert(user: User) = userDao.insert(user)
    suspend fun getUserById(id: Int) = userDao.getUserById(id)
    suspend fun getAllUsers() = userDao.getAllUsers()
    suspend fun deleteAll() = userDao.deleteAll()
}