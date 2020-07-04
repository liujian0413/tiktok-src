package com.p280ss.android.ugc.aweme.account.login.p952a;

import android.text.TextUtils;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12837t;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.a.d */
public abstract class C21273d extends C21272c {
    /* renamed from: b */
    public abstract void mo57256b(String str);

    /* renamed from: b */
    public abstract void mo57257b(String str, String str2);

    /* renamed from: c */
    public abstract void mo57258c(String str);

    public void onSuccess(C12710e<C12837t> eVar) {
        mo57253a(((C12837t) eVar.f33709g).f33964l);
    }

    public void onError(C12710e<C12837t> eVar, int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        if (i > 0) {
            try {
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
                    }
                    if (i != 1009) {
                        if (i != 1033) {
                            if (i == 1039) {
                                mo57250a();
                                return;
                            } else if (i == 2002) {
                                mo57257b(jSONObject2.optString("mobile"), jSONObject2.optString("shark_ticket"));
                                return;
                            } else if (i == 2005) {
                                mo57256b(jSONObject2.getString("platform"));
                                return;
                            } else if (i == 1056) {
                                mo57258c(eVar.f33703c);
                                return;
                            }
                        }
                    }
                    mo57255a(((C12837t) eVar.f33709g).f33964l, String.valueOf(i), eVar.f33703c);
                    return;
                }
                mo57251a("-998");
                mo57254a(jSONObject2, i, eVar.f33703c);
            } catch (Exception unused) {
                mo57251a("-999");
            }
        } else {
            mo57251a("-1000");
            mo57254a((JSONObject) null, -998, C21671bd.m72532b().getString(R.string.b1y));
        }
    }
}
