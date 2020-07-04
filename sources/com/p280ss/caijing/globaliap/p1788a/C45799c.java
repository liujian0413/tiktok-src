package com.p280ss.caijing.globaliap.p1788a;

import android.text.TextUtils;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.caijing.globaliap.p1793e.C45850a;
import com.p280ss.caijing.globaliap.p1793e.C45850a.C45851a;
import com.p280ss.caijing.globaliap.pay.C45872c;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.caijing.globaliap.a.c */
public final class C45799c extends C45850a<C45800a> {

    /* renamed from: a */
    public String f117145a;

    /* renamed from: b */
    public String f117146b;

    /* renamed from: c */
    public String f117147c;

    /* renamed from: d */
    public long f117148d;

    /* renamed from: e */
    public String f117149e;

    /* renamed from: f */
    public String f117150f;

    /* renamed from: g */
    public String f117151g;

    /* renamed from: h */
    public String f117152h;

    /* renamed from: i */
    public long f117153i;

    /* renamed from: com.ss.caijing.globaliap.a.c$a */
    public static class C45800a extends C45851a {

        /* renamed from: a */
        public String f117154a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f117155b;

        /* renamed from: a */
        public final boolean mo111017a() {
            return TextUtils.equals(this.f117155b, "1");
        }

        /* renamed from: b */
        public final boolean mo111018b() {
            return TextUtils.equals(this.f117265g, "CD0408");
        }
    }

    /* renamed from: a */
    public static C45800a m143782a(JSONObject jSONObject) {
        C45800a aVar = new C45800a();
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        aVar.f117265g = jSONObject2.getString("code");
        aVar.f117266h = jSONObject2.optString("msg");
        aVar.f117154a = jSONObject2.optString("trade_no");
        aVar.f117155b = jSONObject2.optString("delete_fe_cache");
        return aVar;
    }

    /* renamed from: a */
    public final Map<String, String> mo111013a(Map<String, String> map) {
        map.put("app_id", this.f117149e);
        map.put("method", "tp.cashdesk.trade_confirm");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", "cashdesk.sdk.googlepay_iap.confirm");
            jSONObject.put("merchant_id", this.f117145a);
            jSONObject.put("uid", this.f117146b);
            jSONObject.put("trade_no", this.f117147c);
            jSONObject.put("trade_amount", this.f117148d);
            jSONObject.put("pay_amount", this.f117148d);
            jSONObject.put("pay_type", "googlepay_iap");
            jSONObject.put("fe_iap_status", "SUCCESS");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("channel_out_order_no", this.f117151g);
            jSONObject2.put("package_name", C45872c.m143951b().getPackageName());
            jSONObject2.put("product_id", this.f117152h);
            jSONObject2.put("environment", "ONLINE");
            jSONObject2.put("token", this.f117150f);
            jSONObject2.put("transaction_date", this.f117153i);
            jSONObject.put("iap_info", jSONObject2);
            map.put("biz_content", URLEncoder.encode(jSONObject.toString(), "UTF-8"));
        } catch (JSONException e) {
            C6497a.m20185b(e);
        } catch (UnsupportedEncodingException e2) {
            C6497a.m20185b(e2);
        }
        return map;
    }
}
