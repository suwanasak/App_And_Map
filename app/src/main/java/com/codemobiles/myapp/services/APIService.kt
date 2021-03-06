package com.codemobiles.myapp.services

import com.codemobiles.myapp.API_PRODUCT
import com.codemobiles.myapp.models.Demo
import com.codemobiles.myapp.models.ProductResponse
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*


interface APIService {
//    @GET(API_PRODUCT)
//    fun getProducts(): Call<List<ProductResponse>>
//
//    @POST(API_PRODUCT)
//    fun addProduct(@Body product: ProductRequest): Call<Any>
//
//    @PUT("$API_PRODUCT/{$API_PRODUCT_PARAMS_ID}")
//    fun editProduct(@Path(API_PRODUCT_PARAMS_ID) id: Int, @Body product: ProductRequest): Call<Any>
//
//    @DELETE("$API_PRODUCT/{$API_PRODUCT_PARAMS_ID}")
//    fun deleteProduct(@Path(API_PRODUCT_PARAMS_ID) id: Int): Call<Any>


    @GET(API_PRODUCT)
    fun demo(): Call<Demo>

    @GET(API_PRODUCT)
    fun getProducts(): Call<ProductResponse>

    @Multipart
    @POST(API_PRODUCT)
    fun addProduct(
        @PartMap map: Map<String, @JvmSuppressWildcards RequestBody>,
        @Part image: MultipartBody.Part?
    ): Call<ResponseBody>
}
