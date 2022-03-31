package com.example.jetpack_compose_webapi.view

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

/**
 * エラー表示
 */
@Composable
fun ErrorView() {
    Text(
        text = "読み込み失敗"
    )
}