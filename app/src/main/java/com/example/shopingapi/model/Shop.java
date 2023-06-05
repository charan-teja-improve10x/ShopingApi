package com.example.shopingapi.model;

import com.google.gson.annotations.SerializedName;

public class Shop {
    @SerializedName("id")
    private String shopId;
    private Integer id;
    @SerializedName("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @SerializedName("app_id")
    private Integer apiId;
    @SerializedName("")
    private String browserIp;
    @SerializedName("buyer_accepts_marketing")
    private Boolean buyerAcceptsMarketing;
    @SerializedName("cancel_reason")
    private String cancelReason;
    @SerializedName("cancelled_at")
    private String cancelledAt;
    @SerializedName("cart_token")
    private String cartToken;
    @SerializedName("checkout_id")
    private Integer checkoutId;
    @SerializedName("checkout_token")
    private String checkoutToken;
    @SerializedName("client_details")
    private ClientDetails clientDetails;
    @SerializedName("closed_at")
    private String closeAt;
    private Boolean confirmed;
    @SerializedName("created_at")
    private String createdAt;
    private String currency;
    @SerializedName("current_subtotal_price")
    private String currentSubtotalPrice;
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
//         "current_total_discounts": "0.00",
//         "current_total_discounts_set": {
//         "shop_money": {
//         "amount": "0.00",
//         "currency_code": "USD"
//         },
//         "presentment_money": {
//         "amount": "0.00",
//         "currency_code": "USD"
//         }
//         },
//         "current_total_duties_set": null,
//         "current_total_price": "1.18",
//         "current_total_price_set": {
//         "shop_money": {
//         "amount": "1.18",
//         "currency_code": "USD"
//         },
//         "presentment_money": {
//         "amount": "1.18",
//         "currency_code": "USD"
//         }
//         },
//         "current_total_tax": "1.23",
//         "current_total_tax_set": {
//         "shop_money": {
//         "amount": "1.23",
//         "currency_code": "USD"
//         },
//         "presentment_money": {
//         "amount": "1.23",
//         "currency_code": "USD"
//         }
//         },
//         "customer_locale": "en-US",
//         "device_id": null,
//         "discount_codes": [],
//         "estimated_taxes": false,
//         "financial_status": "paid",
//         "fulfillment_status": null,
//         "gateway": "shopify_payments",
//         "landing_site": "/",
//         "landing_site_ref": null,
//         "location_id": null,
//         "name": "28",
//         "note": null,
//         "note_attributes": [],
//         "number": 28,
//         "order_number": 28,
//         "order_status_url": "https://www.myshopifystore.com/ordersstuff",
//         "original_total_duties_set": null,
//         "payment_gateway_names": [
//         "shopify_payments"
//         ],
//         "presentment_currency": "USD",
//         "processed_at": "2022-07-10T22:49:35+00:00",
//         "processing_method": "email",
//         "reference": null,
//         "referring_site": "",
//         "source_identifier": null,
//         "source_name": "web",
//         "source_url": null,
//         "subtotal_price": "12.00",
//         "subtotal_price_set": {
//         "shop_money": {
//         "amount": "12.00",
//         "currency_code": "USD"
//         },
//         "presentment_money": {
//         "amount": "12.00",
//         "currency_code": "USD"
//         }
//         },
//         "tags": "residential_address, UPS Ground",
//         "taxes_included": false,
//         "test": false,
//         "token": "3988d",
//         "total_discounts": "0.00",
//         "total_discounts_set": {
//         "shop_money": {
//         "amount": "0.00",
//         "currency_code": "USD"
//         },
//         "presentment_money": {
//         "amount": "0.00",
//         "currency_code": "USD"
//         }
//         },
//         "total_line_items_price": "12.00",
//         "total_line_items_price_set": {
//         "shop_money": {
//         "amount": "12.00",
//         "currency_code": "USD"
//         },
//         "presentment_money": {
//         "amount": "12.00",
//         "currency_code": "USD"
//         }
//         },
//         "total_outstanding": "0.00",
//         "total_price": "95.18",
//         "total_price_set": {
//         "shop_money": {
//         "amount": "95.18",
//         "currency_code": "USD"
//         },
//         "presentment_money": {
//         "amount": "95.18",
//         "currency_code": "USD"
//         }
//         },
//         "total_price_usd": "1.18",
//         "total_shipping_price_set": {
//         "shop_money": {
//         "amount": "1.95",
//         "currency_code": "USD"
//         },
//         "presentment_money": {
//         "amount": "1.95",
//         "currency_code": "USD"
//         }
//         },
//         "total_tax": "1.23",
//         "total_tax_set": {
//         "shop_money": {
//         "amount": "1.23",
//         "currency_code": "USD"
//         },
//         "presentment_money": {
//         "amount": "1.23",
//         "currency_code": "USD"
//         }
//         },
//         "total_tip_received": "0.00",
//         "total_weight": 0,
//         "updated_at": "2022-07-10T22:50:46+00:00",
//         "user_id": null,
//         "discount_applications": [],
//         "fulfillments": [],
//         "line_items": [
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