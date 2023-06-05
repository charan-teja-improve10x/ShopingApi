package com.example.shopingapi.model;

import com.google.gson.annotations.SerializedName;

public class Money {
    private String amount;
    @SerializedName("currency_code")
    private String currencyCode;
}
//         "current_subtotal_price_set": {
//         "shop_money": {
//         "amount": "2.00",
//         "currency_code": "USD"
//         },
//         "presentment_money": {
//         "amount": "2.00",
//         "currency_code": "USD"
//         }
//         },

