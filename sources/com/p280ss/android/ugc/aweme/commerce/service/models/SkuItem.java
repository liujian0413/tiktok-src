package com.p280ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.SkuItem */
public final class SkuItem implements Serializable {
    private boolean canSelect;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    private String f64597id;
    private String imageUrl;
    @C6593c(mo15949a = "is_activity")
    private boolean isActivity;
    @C6593c(mo15949a = "price")
    private int price;
    @C6593c(mo15949a = "stock_num")
    private int stockNum;
    @C6593c(mo15949a = "user_limit")
    private Integer userLimit;

    public static /* synthetic */ SkuItem copy$default(SkuItem skuItem, String str, int i, int i2, Integer num, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = skuItem.f64597id;
        }
        if ((i3 & 2) != 0) {
            i = skuItem.stockNum;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = skuItem.price;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            num = skuItem.userLimit;
        }
        Integer num2 = num;
        if ((i3 & 16) != 0) {
            z = skuItem.isActivity;
        }
        return skuItem.copy(str, i4, i5, num2, z);
    }

    public final String component1() {
        return this.f64597id;
    }

    public final int component2() {
        return this.stockNum;
    }

    public final int component3() {
        return this.price;
    }

    public final Integer component4() {
        return this.userLimit;
    }

    public final boolean component5() {
        return this.isActivity;
    }

    public final SkuItem copy(String str, int i, int i2, Integer num, boolean z) {
        SkuItem skuItem = new SkuItem(str, i, i2, num, z);
        return skuItem;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SkuItem) {
                SkuItem skuItem = (SkuItem) obj;
                if (C7573i.m23585a((Object) this.f64597id, (Object) skuItem.f64597id)) {
                    if (this.stockNum == skuItem.stockNum) {
                        if ((this.price == skuItem.price) && C7573i.m23585a((Object) this.userLimit, (Object) skuItem.userLimit)) {
                            if (this.isActivity == skuItem.isActivity) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean getCanSelect() {
        return this.canSelect;
    }

    public final String getId() {
        return this.f64597id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int getPrice() {
        return this.price;
    }

    public final int getStockNum() {
        return this.stockNum;
    }

    public final Integer getUserLimit() {
        return this.userLimit;
    }

    public final int hashCode() {
        String str = this.f64597id;
        int i = 0;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.stockNum) * 31) + this.price) * 31;
        Integer num = this.userLimit;
        if (num != null) {
            i = num.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.isActivity;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final boolean isActivity() {
        return this.isActivity;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SkuItem(id=");
        sb.append(this.f64597id);
        sb.append(", stockNum=");
        sb.append(this.stockNum);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", userLimit=");
        sb.append(this.userLimit);
        sb.append(", isActivity=");
        sb.append(this.isActivity);
        sb.append(")");
        return sb.toString();
    }

    public final void setActivity(boolean z) {
        this.isActivity = z;
    }

    public final void setCanSelect(boolean z) {
        this.canSelect = z;
    }

    public final void setId(String str) {
        this.f64597id = str;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setPrice(int i) {
        this.price = i;
    }

    public final void setStockNum(int i) {
        this.stockNum = i;
    }

    public final void setUserLimit(Integer num) {
        this.userLimit = num;
    }

    public SkuItem(String str, int i, int i2, Integer num, boolean z) {
        this.f64597id = str;
        this.stockNum = i;
        this.price = i2;
        this.userLimit = num;
        this.isActivity = z;
        this.canSelect = true;
    }

    public /* synthetic */ SkuItem(String str, int i, int i2, Integer num, boolean z, int i3, C7571f fVar) {
        boolean z2;
        if ((i3 & 8) != 0) {
            num = null;
        }
        Integer num2 = num;
        if ((i3 & 16) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        this(str, i, i2, num2, z2);
    }
}
