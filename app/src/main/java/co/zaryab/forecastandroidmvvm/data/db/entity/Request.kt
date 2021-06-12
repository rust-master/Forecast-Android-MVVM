package co.zaryab.forecastandroidmvvm.data.db.entity


import com.google.gson.annotations.SerializedName

data class Request(
    val language: String,
    val query: String,
    val type: String,
    val unit: String
)