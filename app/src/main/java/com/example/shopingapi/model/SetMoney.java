package com.example.shopingapi.model;

import com.google.gson.annotations.SerializedName;

public class SetMoney {

    @SerializedName("shop_money")
    private ShopMoney shopMoney;

    @SerializedName("presentment_money")
    private PresentmentMoney presentmentMoney;
}
