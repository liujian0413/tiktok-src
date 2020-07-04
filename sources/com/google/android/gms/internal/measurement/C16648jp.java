package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C14931j;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.jp */
public final class C16648jp extends C14931j<C16648jp> {

    /* renamed from: a */
    public String f46519a;

    /* renamed from: b */
    public String f46520b;

    /* renamed from: c */
    public String f46521c;

    /* renamed from: d */
    public String f46522d;

    /* renamed from: a */
    public final void mo37998a(C16648jp jpVar) {
        if (!TextUtils.isEmpty(this.f46519a)) {
            jpVar.f46519a = this.f46519a;
        }
        if (!TextUtils.isEmpty(this.f46520b)) {
            jpVar.f46520b = this.f46520b;
        }
        if (!TextUtils.isEmpty(this.f46521c)) {
            jpVar.f46521c = this.f46521c;
        }
        if (!TextUtils.isEmpty(this.f46522d)) {
            jpVar.f46522d = this.f46522d;
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.f46519a);
        hashMap.put("appVersion", this.f46520b);
        hashMap.put("appId", this.f46521c);
        hashMap.put("appInstallerId", this.f46522d);
        return m43370a((Object) hashMap);
    }
}
