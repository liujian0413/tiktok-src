package com.facebook.appevents.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.C13499h;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.C13187j;
import com.facebook.internal.C13876aa;
import com.facebook.internal.C13920m;
import com.facebook.internal.C13924n;
import com.facebook.internal.C13926o;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.appevents.internal.d */
public class C13174d {

    /* renamed from: a */
    private static final String f34894a = C13174d.class.getCanonicalName();

    /* renamed from: b */
    private static final C13187j f34895b = new C13187j(C13499h.m39721g());

    /* renamed from: com.facebook.appevents.internal.d$a */
    static class C13175a {

        /* renamed from: a */
        BigDecimal f34896a;

        /* renamed from: b */
        Currency f34897b;

        /* renamed from: c */
        Bundle f34898c;

        C13175a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            this.f34896a = bigDecimal;
            this.f34897b = currency;
            this.f34898c = bundle;
        }
    }

    /* renamed from: a */
    public static void m38498a() {
        Context g = C13499h.m39721g();
        String k = C13499h.m39725k();
        boolean n = C13499h.m39728n();
        C13876aa.m40978a((Object) g, "context");
        if (n && (g instanceof Application)) {
            AppEventsLogger.m38357a((Application) g, k);
        }
    }

    /* renamed from: b */
    public static boolean m38501b() {
        C13924n a = C13926o.m41097a(C13499h.m39725k());
        if (a == null || !C13499h.m39728n() || !a.f36847k) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static C13175a m38496a(String str, String str2) {
        return m38497a(str, str2, (Map<String, String>) new HashMap<String,String>());
    }

    /* renamed from: a */
    public static void m38499a(String str, long j) {
        Context g = C13499h.m39721g();
        String k = C13499h.m39725k();
        C13876aa.m40978a((Object) g, "context");
        C13924n a = C13926o.m41099a(k, false);
        if (a != null && a.f36843g && j > 0) {
            C13187j jVar = new C13187j(g);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", str);
            jVar.mo32365a("fb_aa_time_spent_on_view", (double) j, bundle);
        }
    }

    /* renamed from: a */
    static void m38500a(String str, String str2, boolean z) {
        String str3;
        if (m38501b()) {
            C13175a a = m38496a(str, str2);
            if (a != null) {
                boolean z2 = false;
                if (z && C13920m.m41091a("app_events_if_auto_log_subs", C13499h.m39725k(), false)) {
                    z2 = true;
                }
                if (z2) {
                    if (C13181f.m38516a(str2)) {
                        str3 = "StartTrial";
                    } else {
                        str3 = "Subscribe";
                    }
                    f34895b.mo32368a(str3, a.f34896a, a.f34897b, a.f34898c);
                    return;
                }
                f34895b.mo32369a(a.f34896a, a.f34897b, a.f34898c);
            }
        }
    }

    /* renamed from: a */
    private static C13175a m38497a(String str, String str2, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String optString = jSONObject2.optString("type");
            bundle.putCharSequence("fb_iap_product_type", optString);
            if (optString.equals("subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String optString2 = jSONObject2.optString("introductoryPriceCycles");
                if (!optString2.isEmpty()) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", optString2);
                }
            }
            for (String str3 : map.keySet()) {
                bundle.putCharSequence(str3, (CharSequence) map.get(str3));
            }
            double d = (double) jSONObject2.getLong("price_amount_micros");
            Double.isNaN(d);
            return new C13175a(new BigDecimal(d / 1000000.0d), Currency.getInstance(jSONObject2.getString("price_currency_code")), bundle);
        } catch (JSONException unused) {
            return null;
        }
    }
}
