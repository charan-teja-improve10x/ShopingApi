package com.example.shopingapi.model;

import com.google.gson.annotations.SerializedName;

public class TaxLine {
    @SerializedName("channel_liable")
    private Boolean channelLiable;
    private String price;
    @SerializedName("price_set")
    private MoneySet priceSet;
    private Float rate;
    private String title;

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

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
