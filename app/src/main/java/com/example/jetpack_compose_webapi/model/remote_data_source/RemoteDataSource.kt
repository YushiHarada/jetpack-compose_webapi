package com.example.jetpack_compose_webapi.model.remote_data_source

/**
 * サーバからのレスポンスを取り出すData Source
 */
interface RemoteDataSource {

    /**
     * サーバからのレスポンスを[GitHubUser]として返す
     */
    suspend fun getGitHubUser(userName: String): GitHubUser

}