package com.example.dohee.ssgsag.data

data class BoardDetailedData (
    val b_id : Int,
    val b_title : String,
    val b_contents : String,
    val b_date : String,
    val u_id : Int,
    val b_like : Int,
    val b_photo : String,
    val auth : Boolean,
    var like : Boolean
)