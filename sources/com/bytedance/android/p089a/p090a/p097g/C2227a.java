package com.bytedance.android.p089a.p090a.p097g;

import android.text.TextUtils;
import com.bytedance.android.p089a.p090a.C2219d;
import com.bytedance.android.p089a.p090a.p096f.C2223a;
import com.bytedance.android.p089a.p090a.p096f.C2226b;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.a.g.a */
public abstract class C2227a<SETTING extends C2226b> implements C2229c {
    /* renamed from: b */
    public abstract String mo7969b();

    /* renamed from: d */
    public void mo7971d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final JSONObject mo7970c() {
        C2223a aVar = C2219d.m9560c().f7458c;
        if (aVar == null) {
            return null;
        }
        String b = mo7969b();
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        return aVar.mo7962a(b);
    }
}
