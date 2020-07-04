package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C14931j;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.e */
public final class C16491e extends C14931j<C16491e> {

    /* renamed from: a */
    public String f46149a;

    /* renamed from: b */
    public String f46150b;

    /* renamed from: c */
    public String f46151c;

    /* renamed from: d */
    public long f46152d;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("category", this.f46149a);
        hashMap.put("action", this.f46150b);
        hashMap.put("label", this.f46151c);
        hashMap.put("value", Long.valueOf(this.f46152d));
        return m43370a((Object) hashMap);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37998a(C14931j jVar) {
        C16491e eVar = (C16491e) jVar;
        if (!TextUtils.isEmpty(this.f46149a)) {
            eVar.f46149a = this.f46149a;
        }
        if (!TextUtils.isEmpty(this.f46150b)) {
            eVar.f46150b = this.f46150b;
        }
        if (!TextUtils.isEmpty(this.f46151c)) {
            eVar.f46151c = this.f46151c;
        }
        if (this.f46152d != 0) {
            eVar.f46152d = this.f46152d;
        }
    }
}
