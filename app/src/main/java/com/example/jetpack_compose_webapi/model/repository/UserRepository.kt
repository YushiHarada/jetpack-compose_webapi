package com.example.jetpack_compose_webapi.model.repository

/**
 * [User]のRepository
 */
interface UserRepository {

    /**
     * [userName]に該当する[User]を返す
     */
    suspend fun getUser(userName: String): User

}