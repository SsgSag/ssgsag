package com.example.dohee.ssgsag.get

import com.example.dohee.ssgsag.data.BoardData

data class GetBoardListResponse(
    val status : Int,
    val message : String,
    val data : ArrayList<BoardData>
)