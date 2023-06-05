package com.example.shopingapi.network;

import com.example.shopingapi.model.Shop;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ShoppingApiStore {

    @GET("renukaTemplates")
    Call<List<Shop>> fetchShopProducts();
}
