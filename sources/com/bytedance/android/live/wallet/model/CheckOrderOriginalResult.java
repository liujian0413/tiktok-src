package com.bytedance.android.live.wallet.model;

import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.network.response.C3477b;
import com.bytedance.android.livesdk.p431y.p432a.C9280a;
import com.google.gson.p276a.C6593c;
import java.util.List;

public class CheckOrderOriginalResult extends C3477b<C3802a, C3803b> {
    public static final int FAIL = 0;
    public static final int SUCCESS = 1;
    private Exception exception;
    private String orderId;
    private String payChannel;
    private int retry;

    /* renamed from: com.bytedance.android.live.wallet.model.CheckOrderOriginalResult$a */
    public static class C3802a {
        @C6593c(mo15949a = "status")

        /* renamed from: a */
        public int f11289a;

        public final String toString() {
            StringBuilder sb = new StringBuilder("CheckOrderData{status=");
            sb.append(this.f11289a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.model.CheckOrderOriginalResult$b */
    public static class C3803b extends Extra {
        @C6593c(mo15949a = "coupon")

        /* renamed from: a */
        public String f11290a;
        @C6593c(mo15949a = "coupon_description")

        /* renamed from: b */
        public String f11291b;
        @C6593c(mo15949a = "coupon_detail")

        /* renamed from: c */
        public List<C9280a> f11292c;

        public final String toString() {
            StringBuilder sb = new StringBuilder("CheckOrderExtra{coupon='");
            sb.append(this.f11290a);
            sb.append('\'');
            sb.append(", couponDescription='");
            sb.append(this.f11291b);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    public Exception getException() {
        return this.exception;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getPayChannel() {
        return this.payChannel;
    }

    public int getRetry() {
        return this.retry;
    }

    public C3802a getData() {
        return (C3802a) this.data;
    }

    public C3803b getExtra() {
        return (C3803b) this.extra;
    }

    public int getStatus() {
        if (this.data == null) {
            return 0;
        }
        return ((C3802a) this.data).f11289a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CheckOrderOriginalResult{data=");
        sb.append(this.data);
        sb.append(", extra=");
        sb.append(this.extra);
        sb.append(", retry=");
        sb.append(this.retry);
        sb.append(", orderId='");
        sb.append(this.orderId);
        sb.append('\'');
        sb.append(", exception=");
        sb.append(this.exception);
        sb.append('}');
        return sb.toString();
    }

    public void setData(C3802a aVar) {
        this.data = aVar;
    }

    public CheckOrderOriginalResult setException(Exception exc) {
        this.exception = exc;
        return this;
    }

    public void setExtra(C3803b bVar) {
        this.extra = bVar;
    }

    public CheckOrderOriginalResult setOrderId(String str) {
        this.orderId = str;
        return this;
    }

    public void setPayChannel(String str) {
        this.payChannel = str;
    }

    public CheckOrderOriginalResult setRetry(int i) {
        this.retry = i;
        return this;
    }

    public CheckOrderOriginalResult setStatus(int i) {
        if (this.data == null) {
            this.data = new C3802a();
        }
        ((C3802a) this.data).f11289a = i;
        return this;
    }
}
