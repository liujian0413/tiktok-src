package com.p280ss.caijing.globaliap.p1791d;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.p280ss.base.p1786b.C45780c;
import com.p280ss.caijing.globaliap.p1791d.C45847i.C45848a;
import com.p280ss.caijing.globaliap.pay.C45874e;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.caijing.globaliap.d.g */
public final class C45845g {
    /* renamed from: a */
    private static JSONObject m143864a(String str) {
        try {
            return new JSONObject(C45780c.m143740b(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m143865b(JSONObject jSONObject) {
        try {
            return jSONObject.getString("app_id");
        } catch (JSONException e) {
            throw new C45817c((Exception) e);
        }
    }

    /* renamed from: a */
    public static Bundle m143860a(C45847i iVar) {
        Bundle bundle = new Bundle();
        bundle.putString("purchaseData", iVar.f117255e);
        bundle.putString("signature", iVar.f117254d);
        return C45874e.m143961a("no order matched", bundle);
    }

    /* renamed from: c */
    private static boolean m143866c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            if (!TextUtils.isEmpty(jSONObject.getString("cj_sdk"))) {
                return true;
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m143863a(JSONObject jSONObject) {
        try {
            return new JSONObject(URLDecoder.decode(jSONObject.getString("biz_content"), "UTF-8")).getJSONObject("iap_info").getString("token");
        } catch (JSONException e) {
            throw new C45817c((Exception) e);
        } catch (UnsupportedEncodingException e2) {
            throw new C45817c((Exception) e2);
        }
    }

    /* renamed from: a */
    static C45847i m143861a(String str, String str2) {
        boolean z;
        String str3;
        long j;
        String str4;
        String str5;
        String str6 = str;
        try {
            JSONObject jSONObject = new JSONObject(str6);
            JSONObject a = m143864a(jSONObject.optString("developerPayload"));
            String str7 = null;
            if (m143866c(a)) {
                str7 = a.optString("trade_no");
                str4 = a.optString("merchant_id");
                j = a.optLong("trade_amount");
                str3 = a.optString("app_id");
                str5 = a.optString("uid");
                z = true;
            } else {
                j = -1;
                str5 = null;
                str4 = null;
                str3 = null;
                z = false;
            }
            String string = jSONObject.getString("purchaseToken");
            String optString = jSONObject.optString("orderId");
            long optLong = jSONObject.optLong("purchaseTime");
            String optString2 = jSONObject.optString("productId");
            C45848a aVar = new C45848a();
            aVar.f117264a.f117252b = str7;
            aVar.f117264a.f117259i = str4;
            aVar.f117264a.f117260j = j;
            aVar.f117264a.f117253c = string;
            aVar.f117264a.f117255e = str6;
            aVar.f117264a.f117254d = str2;
            C45848a a2 = aVar.mo111065a(0);
            a2.f117264a.f117256f = optString;
            a2.f117264a.f117258h = optString2;
            a2.f117264a.f117257g = optLong;
            a2.f117264a.f117263m = z;
            a2.f117264a.f117261k = str3;
            a2.f117264a.f117262l = str5;
            return a2.f117264a;
        } catch (JSONException e) {
            throw new C45817c((Exception) e);
        }
    }

    /* renamed from: a */
    public static String m143862a(String str, String str2, String str3, String str4, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cj_sdk", "1.0");
            jSONObject.put("trade_no", str3);
            jSONObject.put("merchant_id", str4);
            jSONObject.put("trade_amount", j);
            jSONObject.put("app_id", str);
            jSONObject.put("uid", str2);
            return Base64.encodeToString(jSONObject.toString().getBytes(), 2);
        } catch (JSONException unused) {
            return null;
        }
    }
}
