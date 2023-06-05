package com.example.shopingapi.model;

import com.google.gson.annotations.SerializedName;

public class LineItem {

    private Integer id;
    @SerializedName("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @SerializedName("fulfillable_quantity")
    private Integer fulfillableQuantity;
    @SerializedName("fulfillment_service")
    private String fulfillmentService;
    @SerializedName("gift_card")
    private Boolean giftCard;
    private Integer grams;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminGraphqlApiId() {
        return adminGraphqlApiId;
    }

    public void setAdminGraphqlApiId(String adminGraphqlApiId) {
        this.adminGraphqlApiId = adminGraphqlApiId;
    }

    public Integer getFulfillableQuantity() {
        return fulfillableQuantity;
    }

    public void setFulfillableQuantity(Integer fulfillableQuantity) {
        this.fulfillableQuantity = fulfillableQuantity;
    }

    public String getFulfillmentService() {
        return fulfillmentService;
    }

    public void setFulfillmentService(String fulfillmentService) {
        this.fulfillmentService = fulfillmentService;
    }

    public Boolean getGiftCard() {
        return giftCard;
    }

    public void setGiftCard(Boolean giftCard) {
        this.giftCard = giftCard;
    }

    public Integer getGrams() {
        return grams;
    }

    public void setGrams(Integer grams) {
        this.grams = grams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// "line_items": [
//         {
//         "id": 122691,
//         "admin_graphql_api_id": "gid://shopify/somethingelse",
//         "fulfillable_quantity": 1,
//         "fulfillment_service": "manual",
//         "fulfillment_status": null,
//         "gift_card": false,
//         "grams": 0,
//         "name": "That one product | Green",
//         "origin_location": {
//         "id": 329,
//         "country_code": "US",
//         "province_code": "GA",
//         "name": "JohnDoe",
//         "address1": "123 everyway",
//         "address2": "",
//         "city": "Atlanta",
//         "zip": "30349"
//         },
//         "pre_tax_price": "41.00",
//         "pre_tax_price_set": {
//         "shop_money": {
//         "amount": "41.00",
//         "currency_code": "USD"
//         },
//         "presentment_money": {
//         "amount": "41.00",
//         "currency_code": "USD"
//         }
//         },
//         "price": "41.00",
//         "price_set": {
//         "shop_money": {
//         "amount": "41.00",
//         "currency_code": "USD"
//         },
//         "presentment_money": {
//         "amount": "41.00",
//         "currency_code": "USD"
//         }
//         },
//         "product_exists": true,
//         "product_id": 655663,
//         "properties": [],
//         "quantity": 1,
//         "requires_shipping": true,
//         "sku": "101",
//         "tax_code": "P2",
//         "taxable": true,
//         "title": "That one product",
//         "total_discount": "0.00",
//         "total_discount_set": {
//         "shop_money": {
//         "amount": "0.00",
//         "currency_code": "USD"
//         },
//         "presentment_money": {
//         "amount": "0.00",
//         "currency_code": "USD"
//         }
//         },
//         "variant_id": 3966283,
//         "variant_inventory_management": "shopify",
//         "variant_title": "Green",
//         "vendor": "Jim's",
//         "tax_lines": [
//         {
//         "channel_liable": false,
//         "price": "1.64",
//         "price_set": {
//         "shop_money": {
//         "amount": "1.64",
//         "currency_code": "USD"
//         },
//         "presentment_money": {
//         "amount": "1.64",
//         "currency_code": "USD"
//         }
//         },
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
