package com.example.jetpack_compose_webapi.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.example.jetpack_compose_webapi.model.repository.User
import com.example.jetpack_compose_webapi.viewmodel.MainViewModel
import java.lang.IllegalStateException

/**
 * メイン画面
 * ViewModelの状態に応じて、初期表示、読み込み中表示、ユーザー詳細表示、エラー表示を切り替えて表示する
 */
@Composable
fun MainView(mainViewModel: MainViewModel) {

    val uiState by mainViewModel.uiState

    Column(Modifier.fillMaxWidth()) {
        SearchView(
            searchQuery = mainViewModel.searchQuery,
            onSearchButtonTapped = mainViewModel::onSearchTapped,
        )
        when(uiState) {
            is MainViewModel.UiState.Initial -> InitialView()
            is MainViewModel.UiState.Loading -> LoadingView()
            is MainViewModel.UiState.Success -> UserDetailView(user = uiState.requireUser())
            is MainViewModel.UiState.Failure -> ErrorView()
        }
    }

}

/**
 * MainViewModelが保持するUserを強制的に取り出す
 */
private fun MainViewModel.UiState.requireUser(): User {
    if (this !is MainViewModel.UiState.Success) throw IllegalStateException("user is not loaded")
    return user
}