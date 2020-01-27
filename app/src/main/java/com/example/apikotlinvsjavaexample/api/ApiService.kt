package com.example.apikotlinvsjavaexample.api

import com.example.apikotlinvsjavaexample.pojo.CoinInfoListOfData
import com.example.apikotlinvsjavaexample.pojo.CoinPriceInfoRawData
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("top/totalvolfull")
    fun getTopCoinsInfo(
            @Query(QUERY_PARAM_API_KEY) apiKey: String="",
            @Query(QUERY_PARAM_LIMIT) limit: Int=10,
            @Query(QUERY_PARAM_TO_SIMBOL) tSim: String= CURRENCY
            ):Single<CoinInfoListOfData>
    @GET("pricemultifull")
    fun getFullPricesList(
            @Query(QUERY_PARAM_API_KEY) apiKey: String="",
            @Query(QUERY_PARAM_FROM_SIMBOLS) fSims: String,
            @Query(QUERY_PARAM_TO_SIMBOLS) tSims: String= CURRENCY
    ):Single<CoinPriceInfoRawData>
    companion object{
        private const val QUERY_PARAM_API_KEY="limit"
        private const val QUERY_PARAM_LIMIT="limit"
        private const val QUERY_PARAM_TO_SIMBOL="tsym"
        private const val QUERY_PARAM_TO_SIMBOLS="tsyms"
        private const val QUERY_PARAM_FROM_SIMBOLS="fsyms"
        private const val CURRENCY="USD"
    }

}