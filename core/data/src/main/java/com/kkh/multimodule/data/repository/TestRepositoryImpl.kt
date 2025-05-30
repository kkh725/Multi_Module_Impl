package com.kkh.multimodule.data.repository

import android.util.Log
import com.kkh.multimodule.datastore.datasource.LocalDataSource
import com.kkh.multimodule.domain.repository.TestRepository
import com.kkh.multimodule.network.datasource.TestDataSource
import jakarta.inject.Inject

internal class TestRepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource,
    private val networkDataSource: TestDataSource
) : TestRepository {

    override suspend fun localDoit(){
        localDataSource.getCustomText()
    }

    override suspend fun networkDoit(){
        val res = networkDataSource.testPosts()
        if (res.isSuccessful){
            Log.d("network", "networkDoit: network 통신 성공\n ${res.body()}")
        }
    }
}