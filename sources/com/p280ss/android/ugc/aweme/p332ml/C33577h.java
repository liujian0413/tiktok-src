package com.p280ss.android.ugc.aweme.p332ml;

import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.p298ml.C6820a;
import com.p280ss.android.ugc.aweme.app.C6877n;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.ml.h */
public final class C33577h implements C6820a {
    /* renamed from: a */
    public final void mo16661a(Throwable th, String str) {
        C2077a.m9161a(th, str);
    }

    /* renamed from: a */
    public final void mo16660a(String str, HashMap<String, String> hashMap) {
        C7319aa.m22932a((Callable<? extends T>) new C33579i<Object>(str, hashMap)).mo19135b(C7333a.m23044b()).mo19127a(C7333a.m23044b()).mo19137b((C47557ad<? super T>) new C47557ad<Boolean>() {
            public final void onError(Throwable th) {
            }

            public final void onSubscribe(C7321c cVar) {
            }

            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            }
        });
    }

    /* renamed from: b */
    static final /* synthetic */ Boolean m108455b(String str, HashMap hashMap) throws Exception {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", str);
            for (Entry entry : hashMap.entrySet()) {
                if ("consume".equalsIgnoreCase((String) entry.getKey())) {
                    jSONObject.put("consume_time", Long.parseLong((String) entry.getValue()));
                } else {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable unused) {
        }
        C6877n.m21447a("ml-evaluator", jSONObject);
        return Boolean.valueOf(true);
    }
}
