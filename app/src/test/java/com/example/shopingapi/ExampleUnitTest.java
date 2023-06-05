package com.example.shopingapi;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.shopingapi.model.Shop;
import com.example.shopingapi.network.ShopApi;
import com.example.shopingapi.network.ShoppingApiStore;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getShopApiStore() throws IOException {
        ShoppingApiStore shoppingApiStore = new ShopApi().createShoppingApiStore();
        Call<List<Shop>> call = shoppingApiStore.fetchShopProducts();
        List<Shop> shops = call.execute().body();
        assertNotNull(shops);
        assertFalse(shops.isEmpty());
        System.out.println(new Gson().toJson(shops));
    }
}