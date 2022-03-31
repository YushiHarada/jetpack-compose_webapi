package com.example.jetpack_compose_webapi.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.jetpack_compose_webapi.model.repository.User

/**
 * ユーザー情報を文字列として表示する
 */
@Composable
fun UserDetailView(user: User) {
    Column {
        Text(text = user.userId.value.toString())
        Text(text = user.name)
        Text(text = user.avatarImage.url.value)
        Text(text = user.blogUrl.value)
    }
}