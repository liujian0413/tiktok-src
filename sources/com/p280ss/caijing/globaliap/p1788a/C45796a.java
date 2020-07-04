package com.p280ss.caijing.globaliap.p1788a;

import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.caijing.globaliap.p1793e.C45850a;
import com.p280ss.caijing.globaliap.p1793e.C45850a.C45851a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.caijing.globaliap.a.a */
public final class C45796a extends C45850a<C45797a> {

    /* renamed from: a */
    public String f117137a;

    /* renamed from: com.ss.caijing.globaliap.a.a$a */
    public static class C45797a extends C45851a {

        /* renamed from: a */
        public String f117138a;

        /* renamed from: b */
        public String f117139b;

        /* renamed from: c */
        public String f117140c;

        /* renamed from: d */
        public long f117141d;

        /* renamed from: e */
        public String f117142e;

        /* renamed from: f */
        public String f117143f;
    }

    /* renamed from: a */
    public final Map<String, String> mo111013a(Map<String, String> map) {
        map.put("method", "tp.cashdesk.trade_create");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", "cashdesk.sdk.googlepay_iap.create");
            jSONObject.put("params", new JSONObject(this.f117137a));
            map.put("biz_content", URLEncoder.encode(jSONObject.toString(), "UTF-8"));
        } catch (JSONException e) {
            C6497a.m20185b(e);
        } catch (UnsupportedEncodingException e2) {
            C6497a.m20185b(e2);
        }
        return map;
    }
}
