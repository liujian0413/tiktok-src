package com.p280ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.VirtualPromotionBean */
public final class VirtualPromotionBean implements Serializable {
    @C6593c(mo15949a = "already_buy")
    private boolean alreadyBuy;
    @C6593c(mo15949a = "is")
    private boolean isVirtualGoods;

    public final boolean getAlreadyBuy() {
        return this.alreadyBuy;
    }

    public final boolean isVirtualGoods() {
        return this.isVirtualGoods;
    }

    public final void setAlreadyBuy(boolean z) {
        this.alreadyBuy = z;
    }

    public final void setVirtualGoods(boolean z) {
        this.isVirtualGoods = z;
    }
}
