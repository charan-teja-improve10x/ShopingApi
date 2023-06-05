package com.example.shopingapi.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Shop {
    @SerializedName("_id")
    private String shopId;
    private Integer id;
    @SerializedName("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @SerializedName("app_id")
    private Integer apiId;
    @SerializedName("browser_ip")
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
    @SerializedName("current_subtotal_price_set")
    private MoneySet currentSubtotalPriceSet;
    @SerializedName("current_total_discounts")
    private String currentTotalDiscounts;
    @SerializedName("current_total_discounts_set")
    private MoneySet currentTotalDiscountsSet;
    @SerializedName("current_total_duties_set")
    private MoneySet currentTotalDutiesSet;
    @SerializedName("current_total_price")
    private String currentTotalPrice;
    @SerializedName("current_total_price_set")
    private MoneySet currentTotalPriceSet;
    @SerializedName("current_total_tax")
    private String currentTotalTax;
    @SerializedName("current_total_tax_set")
    private MoneySet currentTotalTaxSet;
    @SerializedName("customer_locale")
    private String customerLocale;
    @SerializedName("device_id")
    private String deviceId;
    @SerializedName("discount_codes")
    private List<String> discountCodes;
    @SerializedName("estimated_taxes")
    private Boolean estimatedTaxes;
    @SerializedName("financial_status")
    private String financialStatus;
    @SerializedName("fulfillment_status")
    private String fulfillmentStatus;
    private String gateway;;
    @SerializedName("landing_site")
    private String landingSite;
    @SerializedName("landing_site_ref")
    private String landingSiteRef;
    @SerializedName("location_id")
    private String locationId;
    private String name;
    private String note;
    @SerializedName("note_attributes")
    private List<String> noteAttributes;
    private Integer number;
    @SerializedName("order_number")
    private String orderNumber;
    @SerializedName("order_status_url")
    private String orderStatusUrl;
    @SerializedName("original_total_duties_set")
    private String originalTotalDutiesSet;
    @SerializedName("payment_gateway_names")
    private List<String> paymentGatewayNames;
    @SerializedName("presentment_currency")
    private String presentmentCurrency;
    @SerializedName("processed_at")
    private String processedAt;
    @SerializedName("processing_method")
    private String processingMethod;
    private String reference;
    @SerializedName("referring_site")
    private String referringSite;
    @SerializedName("source_identifier")
    private String sourceIdentifier;
    @SerializedName("source_name")
    private String sourceName;
    @SerializedName("source_url")
    private String sourceUrl;
    @SerializedName("subtotal_price")
    private String subtotalPrice;
    @SerializedName("subtotal_price_set")
    private MoneySet subtotalPriceSet;
    private String tags;
    @SerializedName("taxes_included")
    private String taxesIncluded;
    private Boolean test;
    private String token;
    @SerializedName("total_discounts")
    private String totalDiscounts;
    @SerializedName("total_discounts_set")
    private MoneySet totalDiscountsSet;
    @SerializedName("total_line_items_price")
    private String totalLineItemsPrice;
    @SerializedName("total_line_items_price_set")
    private MoneySet totalLineItemsPriceSet;
    @SerializedName("total_outstanding")
    private String totalOutstanding;
    @SerializedName("total_price")
    private String totalPrice;
    @SerializedName("total_price_set")
    private MoneySet totalPriceSet;
    @SerializedName("total_price_usd")
    private String totalPriceUsd;
    @SerializedName("total_shipping_price_set")
    private MoneySet totalShippingPriceSet;
    @SerializedName("total_tax")
    private String totalTax;
    @SerializedName("total_tax_set")
    private MoneySet totalTaxSet;
    @SerializedName("total_tip_received")
    private String totalTipReceived;
    @SerializedName("total_weight")
    private Integer totalWeight;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("user_id")
    private String userId;
    @SerializedName("discount_applications")
    private List<String> discountApplications;
    private List<String> fulfillments;
    @SerializedName("line_items")
    private List<LineItem> lineItems;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

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

    public Integer getApiId() {
        return apiId;
    }

    public void setApiId(Integer apiId) {
        this.apiId = apiId;
    }

    public String getBrowserIp() {
        return browserIp;
    }

    public void setBrowserIp(String browserIp) {
        this.browserIp = browserIp;
    }

    public Boolean getBuyerAcceptsMarketing() {
        return buyerAcceptsMarketing;
    }

    public void setBuyerAcceptsMarketing(Boolean buyerAcceptsMarketing) {
        this.buyerAcceptsMarketing = buyerAcceptsMarketing;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public String getCancelledAt() {
        return cancelledAt;
    }

    public void setCancelledAt(String cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    public String getCartToken() {
        return cartToken;
    }

    public void setCartToken(String cartToken) {
        this.cartToken = cartToken;
    }

    public Integer getCheckoutId() {
        return checkoutId;
    }

    public void setCheckoutId(Integer checkoutId) {
        this.checkoutId = checkoutId;
    }

    public String getCheckoutToken() {
        return checkoutToken;
    }

    public void setCheckoutToken(String checkoutToken) {
        this.checkoutToken = checkoutToken;
    }

    public ClientDetails getClientDetails() {
        return clientDetails;
    }

    public void setClientDetails(ClientDetails clientDetails) {
        this.clientDetails = clientDetails;
    }

    public String getCloseAt() {
        return closeAt;
    }

    public void setCloseAt(String closeAt) {
        this.closeAt = closeAt;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrentSubtotalPrice() {
        return currentSubtotalPrice;
    }

    public void setCurrentSubtotalPrice(String currentSubtotalPrice) {
        this.currentSubtotalPrice = currentSubtotalPrice;
    }

    public MoneySet getCurrentSubtotalPriceSet() {
        return currentSubtotalPriceSet;
    }

    public void setCurrentSubtotalPriceSet(MoneySet currentSubtotalPriceSet) {
        this.currentSubtotalPriceSet = currentSubtotalPriceSet;
    }

    public String getCurrentTotalDiscounts() {
        return currentTotalDiscounts;
    }

    public void setCurrentTotalDiscounts(String currentTotalDiscounts) {
        this.currentTotalDiscounts = currentTotalDiscounts;
    }

    public MoneySet getCurrentTotalDiscountsSet() {
        return currentTotalDiscountsSet;
    }

    public void setCurrentTotalDiscountsSet(MoneySet currentTotalDiscountsSet) {
        this.currentTotalDiscountsSet = currentTotalDiscountsSet;
    }

    public MoneySet getCurrentTotalDutiesSet() {
        return currentTotalDutiesSet;
    }

    public void setCurrentTotalDutiesSet(MoneySet currentTotalDutiesSet) {
        this.currentTotalDutiesSet = currentTotalDutiesSet;
    }

    public String getCurrentTotalPrice() {
        return currentTotalPrice;
    }

    public void setCurrentTotalPrice(String currentTotalPrice) {
        this.currentTotalPrice = currentTotalPrice;
    }

    public MoneySet getCurrentTotalPriceSet() {
        return currentTotalPriceSet;
    }

    public void setCurrentTotalPriceSet(MoneySet currentTotalPriceSet) {
        this.currentTotalPriceSet = currentTotalPriceSet;
    }

    public String getCurrentTotalTax() {
        return currentTotalTax;
    }

    public void setCurrentTotalTax(String currentTotalTax) {
        this.currentTotalTax = currentTotalTax;
    }

    public MoneySet getCurrentTotalTaxSet() {
        return currentTotalTaxSet;
    }

    public void setCurrentTotalTaxSet(MoneySet currentTotalTaxSet) {
        this.currentTotalTaxSet = currentTotalTaxSet;
    }

    public String getCustomerLocale() {
        return customerLocale;
    }

    public void setCustomerLocale(String customerLocale) {
        this.customerLocale = customerLocale;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public List<String> getDiscountCodes() {
        return discountCodes;
    }

    public void setDiscountCodes(List<String> discountCodes) {
        this.discountCodes = discountCodes;
    }

    public Boolean getEstimatedTaxes() {
        return estimatedTaxes;
    }

    public void setEstimatedTaxes(Boolean estimatedTaxes) {
        this.estimatedTaxes = estimatedTaxes;
    }

    public String getFinancialStatus() {
        return financialStatus;
    }

    public void setFinancialStatus(String financialStatus) {
        this.financialStatus = financialStatus;
    }

    public String getFulfillmentStatus() {
        return fulfillmentStatus;
    }

    public void setFulfillmentStatus(String fulfillmentStatus) {
        this.fulfillmentStatus = fulfillmentStatus;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public String getLandingSite() {
        return landingSite;
    }

    public void setLandingSite(String landingSite) {
        this.landingSite = landingSite;
    }

    public String getLandingSiteRef() {
        return landingSiteRef;
    }

    public void setLandingSiteRef(String landingSiteRef) {
        this.landingSiteRef = landingSiteRef;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<String> getNoteAttributes() {
        return noteAttributes;
    }

    public void setNoteAttributes(List<String> noteAttributes) {
        this.noteAttributes = noteAttributes;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderStatusUrl() {
        return orderStatusUrl;
    }

    public void setOrderStatusUrl(String orderStatusUrl) {
        this.orderStatusUrl = orderStatusUrl;
    }

    public String getOriginalTotalDutiesSet() {
        return originalTotalDutiesSet;
    }

    public void setOriginalTotalDutiesSet(String originalTotalDutiesSet) {
        this.originalTotalDutiesSet = originalTotalDutiesSet;
    }

    public List<String> getPaymentGatewayNames() {
        return paymentGatewayNames;
    }

    public void setPaymentGatewayNames(List<String> paymentGatewayNames) {
        this.paymentGatewayNames = paymentGatewayNames;
    }

    public String getPresentmentCurrency() {
        return presentmentCurrency;
    }

    public void setPresentmentCurrency(String presentmentCurrency) {
        this.presentmentCurrency = presentmentCurrency;
    }

    public String getProcessedAt() {
        return processedAt;
    }

    public void setProcessedAt(String processedAt) {
        this.processedAt = processedAt;
    }

    public String getProcessingMethod() {
        return processingMethod;
    }

    public void setProcessingMethod(String processingMethod) {
        this.processingMethod = processingMethod;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getReferringSite() {
        return referringSite;
    }

    public void setReferringSite(String referringSite) {
        this.referringSite = referringSite;
    }

    public String getSourceIdentifier() {
        return sourceIdentifier;
    }

    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getSubtotalPrice() {
        return subtotalPrice;
    }

    public void setSubtotalPrice(String subtotalPrice) {
        this.subtotalPrice = subtotalPrice;
    }

    public MoneySet getSubtotalPriceSet() {
        return subtotalPriceSet;
    }

    public void setSubtotalPriceSet(MoneySet subtotalPriceSet) {
        this.subtotalPriceSet = subtotalPriceSet;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getTaxesIncluded() {
        return taxesIncluded;
    }

    public void setTaxesIncluded(String taxesIncluded) {
        this.taxesIncluded = taxesIncluded;
    }

    public Boolean getTest() {
        return test;
    }

    public void setTest(Boolean test) {
        this.test = test;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTotalDiscounts() {
        return totalDiscounts;
    }

    public void setTotalDiscounts(String totalDiscounts) {
        this.totalDiscounts = totalDiscounts;
    }

    public MoneySet getTotalDiscountsSet() {
        return totalDiscountsSet;
    }

    public void setTotalDiscountsSet(MoneySet totalDiscountsSet) {
        this.totalDiscountsSet = totalDiscountsSet;
    }

    public String getTotalLineItemsPrice() {
        return totalLineItemsPrice;
    }

    public void setTotalLineItemsPrice(String totalLineItemsPrice) {
        this.totalLineItemsPrice = totalLineItemsPrice;
    }

    public MoneySet getTotalLineItemsPriceSet() {
        return totalLineItemsPriceSet;
    }

    public void setTotalLineItemsPriceSet(MoneySet totalLineItemsPriceSet) {
        this.totalLineItemsPriceSet = totalLineItemsPriceSet;
    }

    public String getTotalOutstanding() {
        return totalOutstanding;
    }

    public void setTotalOutstanding(String totalOutstanding) {
        this.totalOutstanding = totalOutstanding;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public MoneySet getTotalPriceSet() {
        return totalPriceSet;
    }

    public void setTotalPriceSet(MoneySet totalPriceSet) {
        this.totalPriceSet = totalPriceSet;
    }

    public String getTotalPriceUsd() {
        return totalPriceUsd;
    }

    public void setTotalPriceUsd(String totalPriceUsd) {
        this.totalPriceUsd = totalPriceUsd;
    }

    public MoneySet getTotalShippingPriceSet() {
        return totalShippingPriceSet;
    }

    public void setTotalShippingPriceSet(MoneySet totalShippingPriceSet) {
        this.totalShippingPriceSet = totalShippingPriceSet;
    }

    public String getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(String totalTax) {
        this.totalTax = totalTax;
    }

    public MoneySet getTotalTaxSet() {
        return totalTaxSet;
    }

    public void setTotalTaxSet(MoneySet totalTaxSet) {
        this.totalTaxSet = totalTaxSet;
    }

    public String getTotalTipReceived() {
        return totalTipReceived;
    }

    public void setTotalTipReceived(String totalTipReceived) {
        this.totalTipReceived = totalTipReceived;
    }

    public Integer getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Integer totalWeight) {
        this.totalWeight = totalWeight;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getDiscountApplications() {
        return discountApplications;
    }

    public void setDiscountApplications(List<String> discountApplications) {
        this.discountApplications = discountApplications;
    }

    public List<String> getFulfillments() {
        return fulfillments;
    }

    public void setFulfillments(List<String> fulfillments) {
        this.fulfillments = fulfillments;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }
}

//

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