package com.p280ss.android.ugc.aweme.sdk.bean;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.sdk.bean.DiamondStruct */
public class DiamondStruct {
    @C6593c(mo15949a = "describe")
    public String describe;
    @C6593c(mo15949a = "diamond_count")
    public int diamondCount;
    @C6593c(mo15949a = "exchange_price")
    public int exchangePrice;
    @C6593c(mo15949a = "giving_count")
    public int givingCount;
    @C6593c(mo15949a = "iap_id")
    public String iapId;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    public int f97461id;
    @C6593c(mo15949a = "price")
    public int price;

    public String toString() {
        StringBuilder sb = new StringBuilder("DiamondStruct{id=");
        sb.append(this.f97461id);
        sb.append(", iapId='");
        sb.append(this.iapId);
        sb.append('\'');
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", exchangePrice=");
        sb.append(this.exchangePrice);
        sb.append(", diamondCount=");
        sb.append(this.diamondCount);
        sb.append(", givingCount=");
        sb.append(this.givingCount);
        sb.append(", describe='");
        sb.append(this.describe);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
