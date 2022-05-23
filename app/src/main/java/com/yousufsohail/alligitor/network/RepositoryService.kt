package com.yousufsohail.alligitor.network

import com.yousufsohail.alligitor.network.model.RepositoryEntity
import com.yousufsohail.alligitor.network.response.RepositorySearchResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RepositoryService {

    @GET("search/repositories")
    suspend fun search(
        @Query("q") query: String,
        @Query("page") page: Int = 1,
        @Query("per_page") pageSize: Int = 10,
        @Query("order") sortOrder: String = "desc",
        @Query("sort") sortFactor: String = "stars",
    ): RepositorySearchResponse

    @GET("repos/{owner}/{repo}")
    suspend fun get(
        @Path("owner") owner: String,
        @Path("repo") repo: String
    ): RepositoryEntity
}