package com.example.dohee.ssgsag.network

import com.example.dohee.ssgsag.get.GetBoardDetailedResponse
import com.example.dohee.ssgsag.get.GetBoardListResponse
import com.example.dohee.ssgsag.post.PostLogInResponse
import com.example.dohee.ssgsag.post.PostSignUpResponse
import com.example.dohee.ssgsag.post.PostWriteBoardResponse
import com.google.gson.JsonObject
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*

interface NetworkService{
    //회원가입
    @Multipart
    @POST("/users")
    fun postSignUpResponse(
        @Part("userEmail") userEmail : RequestBody,
        @Part("userPw") userPw : RequestBody,
        @Part("userName") userName : RequestBody,
        @Part("userUniv") userUniv : RequestBody,
        @Part("userMajor") userMajor : RequestBody
    ) : Call<PostSignUpResponse> //return type

    //로그인
    @POST("/login")
    fun postLoginResponse(
        @Header("Content-Type") content_type : String,
        @Body() body : JsonObject
    ) : Call<PostLogInResponse>

    //게시판 글쓰기
    @Multipart
    @POST("/contents")
    fun postWriteBoardResponse(
        @Header("Authorization") token : String,
        @Part("title") title : RequestBody,
        @Part("contents") contents : RequestBody,
        @Part photo: MultipartBody.Part? //파일은 소괄호가 없음, 이름이 있어서는 안됨
    ):Call<PostWriteBoardResponse>

    //게시판 글 보기
    @GET("/contents")
    fun getBoardListResponse(
        @Header("Content-Type") content_type : String,
        @Query("offset") offset : Int,
        @Query("limit") limit : Int
    ) : Call<GetBoardListResponse>

    //게시판 글 상세보기
    @GET("/contents")
    fun getBoardDetailedResponse(
        @Header("Content-Type") content_type : String
    ) : Call<GetBoardDetailedResponse>

}