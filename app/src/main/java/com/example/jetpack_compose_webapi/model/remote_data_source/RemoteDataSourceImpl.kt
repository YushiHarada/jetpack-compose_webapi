package com.example.jetpack_compose_webapi.model.remote_data_source

import javax.inject.Inject

/**
 * [RemoteDataSource]の実装クラス
 */
class RemoteDataSourceImpl @Inject constructor(
    private val apiClient: ApiClient,
): RemoteDataSource {

    override suspend fun getGitHubUser(userName: String): GitHubUser {
        val response = apiClient.getGItHubUser(
            userName = userName
        )
        if (response.isSuccessful) {
            return requireNotNull(response.body())
        }
        throw HttpException()
    }

}

/**
 * ResponseがisSuccessful != trueだった時に投げられる例外
 */
class HttpException: Throwable()