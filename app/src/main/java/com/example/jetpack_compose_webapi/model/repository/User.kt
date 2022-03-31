package com.example.jetpack_compose_webapi.model.repository

/**
 * ユーザを表すクラス
 */
data class User (
    val userId: UserId,
    val name: String,
    val avatarImage: NetworkImage,
    val blogUrl: Url,
)