package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C14931j;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.j */
public final class C16632j extends C14931j<C16632j> {

    /* renamed from: a */
    public String f46490a;

    /* renamed from: b */
    public long f46491b;

    /* renamed from: c */
    public String f46492c;

    /* renamed from: d */
    public String f46493d;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("variableName", this.f46490a);
        hashMap.put("timeInMillis", Long.valueOf(this.f46491b));
        hashMap.put("category", this.f46492c);
        hashMap.put("label", this.f46493d);
        return m43370a((Object) hashMap);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37998a(C14931j jVar) {
        C16632j jVar2 = (C16632j) jVar;
        if (!TextUtils.isEmpty(this.f46490a)) {
            jVar2.f46490a = this.f46490a;
        }
        if (this.f46491b != 0) {
            jVar2.f46491b = this.f46491b;
        }
        if (!TextUtils.isEmpty(this.f46492c)) {
            jVar2.f46492c = this.f46492c;
        }
        if (!TextUtils.isEmpty(this.f46493d)) {
            jVar2.f46493d = this.f46493d;
        }
    }
}
