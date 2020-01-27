package com.example.apikotlinvsjavaexample.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

 data class CoinInfo (


    @SerializedName("Id")
    @Expose
    private val id: String? = null,
    @SerializedName("Name")
    @Expose
    private val name: String? = null,
    @SerializedName("FullName")
    @Expose
    private val fullName: String? = null,
//    @SerializedName("Internal")
//    @Expose
//    val internal: String? = null
    @SerializedName("ImageUrl")
    @Expose
    val imageUrl: String? = null
)
//    @SerializedName("Url")
//    @Expose
//    val url: String? = null
//    @SerializedName("Algorithm")
//    @Expose
//    val algorithm: String? = null
//    @SerializedName("ProofType")
//    @Expose
//    val proofType: String? = null
//    @SerializedName("NetHashesPerSecond")
//    @Expose
//    val netHashesPerSecond: Int? = null
//    @SerializedName("BlockNumber")
//    @Expose
//    val blockNumber: Int? = null
//    @SerializedName("BlockTime")
//    @Expose
//    val blockTime: Int? = null
//    @SerializedName("BlockReward")
//    @Expose
//    val blockReward: Double? = null
//    @SerializedName("Type")
//    @Expose
//    val type: Int? = null
//    @SerializedName("DocumentType")
//    @Expose
//    val documentType: String? = null
