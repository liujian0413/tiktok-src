package com.bytedance.android.live.wallet.monitor;

import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.livesdkapi.host.PayChannel;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.CronetIOException;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public final class OrderMonitor {

    public enum Channel {
        UNKNOWN("unknown"),
        TEST("test"),
        ALI_PAY("alipay"),
        WECHAT_PAY("wxpay"),
        GOOGLE_PAY("google_pay"),
        VISA("visa"),
        MASTER_CARD("master_card"),
        ONE_CARD("one_card"),
        BOKU("boku");
        
        private final String domain;

        private Channel(String str) {
            this.domain = str;
        }
    }

    public enum Stage {
        CREATE_ORDER("create"),
        ALI_PAY("alipay"),
        WECHAT_PAY("wxpay"),
        GOOGLE_PAY("google_pay"),
        CHECK_ORDER("check"),
        WALLET("wallet"),
        VERIFY("verify"),
        CONSUME("consume");
        
        public final String domain;

        public final String getDomain() {
            return this.domain;
        }

        private Stage(String str) {
            this.domain = str;
        }
    }

    /* renamed from: a */
    public static void m13584a(PayChannel payChannel, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("errorDomain", payChannel);
            C3172e.m12009c("hotsoon_live_create_order_failure_rate", 0, jSONObject2);
        } catch (JSONException e) {
            C3166a.m11963b("OrderMonitor", (Throwable) e);
        }
    }

    /* renamed from: a */
    public static void m13576a() {
        m13577a(0);
    }

    /* renamed from: a */
    private static void m13577a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pay_type", 0);
        } catch (JSONException unused) {
        }
        C3172e.m12009c("hotsoon_live_recharge_failure_rate", 0, jSONObject);
    }

    /* renamed from: a */
    public static void m13578a(Stage stage, Exception exc) {
        m13579a(stage, exc, 0);
    }

    /* renamed from: a */
    public static void m13582a(PayChannel payChannel, Exception exc) {
        if (exc instanceof ApiServerException) {
            ApiServerException apiServerException = (ApiServerException) exc;
            m13581a(payChannel, apiServerException.getErrorCode(), apiServerException.getErrorMsg(), (JSONObject) null);
        } else if (exc instanceof CronetIOException) {
            m13581a(payChannel, 2, exc.toString(), (JSONObject) null);
        } else if (exc instanceof IOException) {
            m13581a(payChannel, 3, exc.toString(), (JSONObject) null);
        } else {
            m13581a(payChannel, 0, exc.toString(), (JSONObject) null);
        }
    }

    /* renamed from: a */
    public static void m13583a(PayChannel payChannel, String str) {
        m13581a(payChannel, 0, str, (JSONObject) null);
    }

    /* renamed from: a */
    private static void m13579a(Stage stage, Exception exc, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pay_type", 0);
        } catch (JSONException unused) {
        }
        if (exc instanceof ApiServerException) {
            ApiServerException apiServerException = (ApiServerException) exc;
            m13580a(stage, String.valueOf(apiServerException.getErrorCode()), apiServerException.getErrorMsg(), jSONObject);
            return;
        }
        m13580a(stage, "0", exc.toString(), jSONObject);
    }

    /* renamed from: a */
    public static void m13580a(Stage stage, String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (JSONException unused) {
                return;
            }
        }
        jSONObject.put("errorDomain", stage.domain);
        jSONObject.put("errorCode", str);
        jSONObject.put("errorDesc", str2);
        C3172e.m12009c("hotsoon_live_recharge_failure_rate", 1, jSONObject);
    }

    /* renamed from: a */
    public static void m13581a(PayChannel payChannel, int i, String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("errorDomain", payChannel);
            jSONObject2.put("errorCode", i);
            jSONObject2.put("errorDesc", str);
            C3172e.m12009c("hotsoon_live_create_order_failure_rate", 1, jSONObject2);
        } catch (JSONException e) {
            C3166a.m11963b("OrderMonitor", (Throwable) e);
        }
    }

    /* renamed from: a */
    public static JSONObject m13575a(int i, long j, String str, String str2, String str3, long j2, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("item_id", j);
            jSONObject.put("iap_id", str);
            jSONObject.put("hotsoon_order_id", str2);
            jSONObject.put("iap_order_id", str3);
            jSONObject.put("purchase_time", 0);
            jSONObject.put("extra", str4);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
