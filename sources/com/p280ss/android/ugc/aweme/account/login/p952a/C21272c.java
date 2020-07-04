package com.p280ss.android.ugc.aweme.account.login.p952a;

import android.text.TextUtils;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12837t;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12857r;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.a.c */
public abstract class C21272c extends C12857r {
    /* renamed from: a */
    public abstract void mo57250a();

    /* renamed from: a */
    public void mo57251a(String str) {
    }

    /* renamed from: a */
    public abstract void mo57252a(String str, String str2);

    /* renamed from: a */
    public abstract void mo57253a(JSONObject jSONObject);

    /* renamed from: a */
    public void mo57254a(JSONObject jSONObject, int i, String str) {
    }

    /* renamed from: a */
    public abstract void mo57255a(JSONObject jSONObject, String str, String str2);

    public void onSuccess(C12710e<C12837t> eVar) {
        mo57253a(((C12837t) eVar.f33709g).f33964l);
    }

    public void onError(C12710e<C12837t> eVar, int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        if (i > 0) {
            if (eVar.f33709g != null) {
                jSONObject = ((C12837t) eVar.f33709g).f33964l;
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                jSONObject2 = jSONObject.optJSONObject("data");
            }
            if (jSONObject2 != null) {
                String optString = jSONObject2.optString("captcha");
                if (!TextUtils.isEmpty(optString)) {
                    mo57252a(optString, eVar.f33703c);
                    return;
                } else if (i == 1009 || i == 1033) {
                    mo57255a(((C12837t) eVar.f33709g).f33964l, String.valueOf(i), eVar.f33703c);
                    return;
                } else if (i == 1039) {
                    mo57250a();
                    return;
                }
            }
            mo57251a("-998");
            mo57254a(jSONObject2, i, eVar.f33703c);
            return;
        }
        mo57251a("-1000");
        mo57254a((JSONObject) null, -998, C21671bd.m72532b().getString(R.string.b1y));
    }
}
