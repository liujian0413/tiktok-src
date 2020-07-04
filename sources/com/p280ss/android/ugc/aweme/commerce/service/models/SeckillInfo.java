package com.p280ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.SeckillInfo */
public final class SeckillInfo implements Serializable {
    @C6593c(mo15949a = "begin_time")
    private long beginTime;
    @C6593c(mo15949a = "card_title")
    private String cardTitle = "";
    @C6593c(mo15949a = "current_time")
    private long currentTime;
    @C6593c(mo15949a = "end_time")
    private long endTime;
    @C6593c(mo15949a = "left_stock")
    private int leftStock;
    @C6593c(mo15949a = "pre_begin_time")
    private long preBeginTime;
    @C6593c(mo15949a = "sku_max_price")
    private int skuMaxPrice;
    @C6593c(mo15949a = "sku_min_price")
    private int skuMinPrice;
    @C6593c(mo15949a = "stock")
    private int stock;
    @C6593c(mo15949a = "title")
    private String title = "";

    public final long getBeginTime() {
        return this.beginTime;
    }

    public final String getCardTitle() {
        return this.cardTitle;
    }

    public final long getCurrentTime() {
        return this.currentTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getLeftStock() {
        return this.leftStock;
    }

    public final long getPreBeginTime() {
        return this.preBeginTime;
    }

    public final int getSkuMaxPrice() {
        return this.skuMaxPrice;
    }

    public final int getSkuMinPrice() {
        return this.skuMinPrice;
    }

    public final int getStock() {
        return this.stock;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean canBeShow() {
        if (this.currentTime != 0) {
            return true;
        }
        return false;
    }

    public final void setBeginTime(long j) {
        this.beginTime = j;
    }

    public final void setCardTitle(String str) {
        this.cardTitle = str;
    }

    public final void setCurrentTime(long j) {
        this.currentTime = j;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setLeftStock(int i) {
        this.leftStock = i;
    }

    public final void setPreBeginTime(long j) {
        this.preBeginTime = j;
    }

    public final void setSkuMaxPrice(int i) {
        this.skuMaxPrice = i;
    }

    public final void setSkuMinPrice(int i) {
        this.skuMinPrice = i;
    }

    public final void setStock(int i) {
        this.stock = i;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
