package com.example.jetpack_compose_webapi.model.remote_data_source

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Retrofitを用いたGitHub APIのクライアント
 */
interface ApiClient {

    @GET("users/{username}")
    suspend fun getGItHubUser(@Path("username")userName: String): Response<GitHubUser>

}