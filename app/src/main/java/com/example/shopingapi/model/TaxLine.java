package com.example.shopingapi.model;

import com.google.gson.annotations.SerializedName;

public class TaxLine {
    @SerializedName("channel_liable")
    private Boolean channelLiable;
    private String price;
    @SerializedName("price_set")
    private MoneySet priceSet;
//    private Integer rate;
//    private String title;
//
    public Boolean getChannelLiable() {
        return channelLiable;
    }

    public void setChannelLiable(Boolean channelLiable) {
        this.channelLiable = channelLiable;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public MoneySet getPriceSet() {
        return priceSet;
    }

    public void setPriceSet(MoneySet priceSet) {
        this.priceSet = priceSet;
    }
//
//    public Integer getRate() {
//        return rate;
//    }
//
//    public void setRate(Integer rate) {
//        this.rate = rate;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
}


//         "rate": 0.04,
//         "title": "STATE TAX"
//         },
//         {
//         "channel_liable": false,
//         "price": "1.23",
//         "price_set": {
//         "shop_money": {
//         "amount": "1.23",
//         "currency_code": "USD"
//         },
//         "presentment_money": {
//         "amount": "1.23",
//         "currency_code": "USD"
//         }
//         },
//         "rate": 0.03,
//         "title": "COUNTY TAX"
//         }
//         ],
//         "duties": [],
//         "discount_allocations": []
//         }
//         ],
//         "payment_terms": null,
//         "refunds": []
//         }
//         ]