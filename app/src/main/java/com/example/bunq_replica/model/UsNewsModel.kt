package com.example.bunq_replica.model

import java.io.Serializable

data class UsNewsModel(
    val newsText: String,
    val newsUrl: String,
    val newsId: Int,
    val newsTitle: String,
    val newsType: String,
    val newsBackgroundColor: String,
    val newsColor: String,
    val newsClaps: String,
    val newsColorCode: Int
) : Serializable