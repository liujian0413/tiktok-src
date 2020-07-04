package com.p280ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.CommerceToutiaoButton */
public final class CommerceToutiaoButton implements Serializable {
    @C6593c(mo15949a = "h5_url")
    private String h5Url;
    @C6593c(mo15949a = "order_status")
    private int orderStatus = OrderStatus.UN_BUY.getStatus();
    @C6593c(mo15949a = "sku_confirm_text")
    private List<String> skuConfirmText = C7525m.m23461a();
    @C6593c(mo15949a = "small_app_url")
    private String smallAppUrl;
    @C6593c(mo15949a = "text")
    private List<String> textList = C7525m.m23461a();

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.models.CommerceToutiaoButton$OrderStatus */
    public enum OrderStatus {
        UN_BUY(1),
        UN_PAY(2),
        CAN_EXPERIENCE(3),
        CAN_NOT_EXPERIENCE(4);
        
        private final int status;

        public final int getStatus() {
            return this.status;
        }

        private OrderStatus(int i) {
            this.status = i;
        }
    }

    public final String getH5Url() {
        return this.h5Url;
    }

    public final int getOrderStatus() {
        return this.orderStatus;
    }

    public final List<String> getSkuConfirmText() {
        return this.skuConfirmText;
    }

    public final String getSmallAppUrl() {
        return this.smallAppUrl;
    }

    public final List<String> getTextList() {
        return this.textList;
    }

    public final void setH5Url(String str) {
        this.h5Url = str;
    }

    public final void setOrderStatus(int i) {
        this.orderStatus = i;
    }

    public final void setSmallAppUrl(String str) {
        this.smallAppUrl = str;
    }

    public final void setSkuConfirmText(List<String> list) {
        C7573i.m23587b(list, "<set-?>");
        this.skuConfirmText = list;
    }

    public final void setTextList(List<String> list) {
        C7573i.m23587b(list, "<set-?>");
        this.textList = list;
    }
}
