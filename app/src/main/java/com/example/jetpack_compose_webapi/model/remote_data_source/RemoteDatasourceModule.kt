package com.example.jetpack_compose_webapi.model.remote_data_source

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

/**
 * [RemoteDataSource]のModule
 */
@Module
@InstallIn(ViewModelComponent::class)
class RemoteDatasourceModule {

    /**
     * [RemoteDataSource]のDIに用いられるインスタンスを生成して返す
     */
    @Provides
    fun provideRemoteDataSource(remoteDataSourceImpl: RemoteDataSourceImpl): RemoteDataSource {
        return remoteDataSourceImpl
    }

}