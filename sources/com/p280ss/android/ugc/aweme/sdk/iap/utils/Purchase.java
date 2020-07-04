package com.p280ss.android.ugc.aweme.sdk.iap.utils;

import com.bytedance.common.utility.collection.C6309f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.utils.Purchase */
public class Purchase {
    private String developerPayload;
    private boolean isAutoRenewing;
    private String itemType;
    private String orderId;
    private String originalJson;
    private String packageName;
    private int pendingCount;
    private int purchaseState;
    private long purchaseTime;
    private String purchaseToken;
    private int retryCount;
    private String signature;
    private String sku;
    private String token;
    private String transactionId;
    private C6309f weakHandler;

    public String getDeveloperPayload() {
        return this.developerPayload;
    }

    public String getItemType() {
        return this.itemType;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getOriginalJson() {
        return this.originalJson;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getPendingCount() {
        return this.pendingCount;
    }

    public int getPurchaseState() {
        return this.purchaseState;
    }

    public long getPurchaseTime() {
        return this.purchaseTime;
    }

    public String getPurchaseToken() {
        return this.purchaseToken;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public String getSignature() {
        return this.signature;
    }

    public String getSku() {
        return this.sku;
    }

    public String getToken() {
        return this.token;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public C6309f getWeakHandler() {
        return this.weakHandler;
    }

    public boolean isAutoRenewing() {
        return this.isAutoRenewing;
    }

    public String toString() {
        return this.originalJson;
    }

    public int hashCode() {
        return this.orderId.hashCode();
    }

    public String getInnerOrderId() {
        String[] split = this.developerPayload.split(",");
        if (split.length > 2) {
            return split[2];
        }
        return "";
    }

    public void setPendingCount(int i) {
        this.pendingCount = i;
    }

    public void setPurchaseToken(String str) {
        this.purchaseToken = str;
    }

    public void setRetryCount(int i) {
        this.retryCount = i;
    }

    public void setTransactionId(String str) {
        this.transactionId = str;
    }

    public void setWeakHandler(C6309f fVar) {
        this.weakHandler = fVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Purchase) || !this.orderId.equals(((Purchase) obj).getOrderId())) {
            return false;
        }
        return true;
    }

    public Purchase(String str, String str2, String str3) throws JSONException {
        this.itemType = str;
        this.originalJson = str2;
        JSONObject jSONObject = new JSONObject(this.originalJson);
        this.orderId = jSONObject.optString("orderId");
        this.packageName = jSONObject.optString("packageName");
        this.sku = jSONObject.optString("productId");
        this.purchaseTime = jSONObject.optLong("purchaseTime");
        this.purchaseState = jSONObject.optInt("purchaseState");
        this.developerPayload = jSONObject.optString("developerPayload");
        this.token = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
        this.purchaseToken = jSONObject.optString("purchaseToken");
        this.isAutoRenewing = jSONObject.optBoolean("autoRenewing");
        this.signature = str3;
    }
}
