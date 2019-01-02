package com.example.dohee.ssgsag.get

import com.example.dohee.ssgsag.data.BoardDetailedData

data class GetBoardDetailedResponse (
    val status : Int,
    val message : String,
    val data : ArrayList<BoardDetailedData>
)