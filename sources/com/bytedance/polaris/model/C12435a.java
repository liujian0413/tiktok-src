package com.bytedance.polaris.model;

import android.app.ProgressDialog;
import com.bytedance.common.utility.C6319n;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.model.a */
public final class C12435a {

    /* renamed from: a */
    public int f33013a;

    /* renamed from: b */
    public String f33014b;

    /* renamed from: c */
    public String f33015c;

    /* renamed from: d */
    public String f33016d;

    /* renamed from: e */
    public String f33017e;

    /* renamed from: f */
    public String f33018f;

    /* renamed from: g */
    public String f33019g;

    /* renamed from: h */
    public String f33020h;

    /* renamed from: i */
    public String f33021i;

    /* renamed from: j */
    public boolean f33022j;

    /* renamed from: k */
    public boolean f33023k;

    /* renamed from: l */
    public JSONObject f33024l;

    /* renamed from: m */
    public WeakReference<ProgressDialog> f33025m;

    /* renamed from: n */
    public byte[] f33026n;

    /* renamed from: o */
    public String f33027o;

    /* renamed from: p */
    public String f33028p;

    /* renamed from: a */
    public final void mo30346a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            this.f33014b = jSONObject.optString("platform", "");
            this.f33015c = jSONObject.optString("title", "");
            this.f33016d = jSONObject.optString("desc", "");
            this.f33018f = jSONObject.optString("image", "");
            this.f33019g = jSONObject.optString("url", "");
            this.f33020h = jSONObject.optString("channel", "sdk");
            this.f33017e = jSONObject.optString("text", "");
            this.f33021i = jSONObject.optString("qr_code_url", "");
            this.f33023k = jSONObject.optBoolean("image_have_qrcode", false);
            this.f33022j = jSONObject.optBoolean("is_include_logo", false);
            if (C6319n.m19593a(this.f33016d)) {
                this.f33016d = this.f33017e;
            }
        }
    }
}
