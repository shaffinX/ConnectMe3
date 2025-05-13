package com.shaffinimam.i212963.postdata

data class Post(
    val postId: Int,
    val picture: String,
    val likes: Int,
    val profilePic: String,
    val caption: String,
    val username: String
)
