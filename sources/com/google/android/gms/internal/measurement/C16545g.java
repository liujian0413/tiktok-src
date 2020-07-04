package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C14931j;
import com.google.android.gms.common.internal.C15267r;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.g */
public final class C16545g extends C14931j<C16545g> {

    /* renamed from: a */
    public String f46333a;

    /* renamed from: b */
    public String f46334b;

    /* renamed from: c */
    public String f46335c;

    /* renamed from: d */
    public String f46336d;

    /* renamed from: e */
    public boolean f46337e;

    /* renamed from: f */
    public String f46338f;

    /* renamed from: g */
    public boolean f46339g;

    /* renamed from: h */
    public double f46340h;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("hitType", this.f46333a);
        hashMap.put("clientId", this.f46334b);
        hashMap.put("userId", this.f46335c);
        hashMap.put("androidAdId", this.f46336d);
        hashMap.put("AdTargetingEnabled", Boolean.valueOf(this.f46337e));
        hashMap.put("sessionControl", this.f46338f);
        hashMap.put("nonInteraction", Boolean.valueOf(this.f46339g));
        hashMap.put("sampleRate", Double.valueOf(this.f46340h));
        return m43370a((Object) hashMap);
    }

    /* renamed from: a */
    public final void mo42758a(boolean z) {
        this.f46339g = true;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37998a(C14931j jVar) {
        C16545g gVar = (C16545g) jVar;
        if (!TextUtils.isEmpty(this.f46333a)) {
            gVar.f46333a = this.f46333a;
        }
        if (!TextUtils.isEmpty(this.f46334b)) {
            gVar.f46334b = this.f46334b;
        }
        if (!TextUtils.isEmpty(this.f46335c)) {
            gVar.f46335c = this.f46335c;
        }
        if (!TextUtils.isEmpty(this.f46336d)) {
            gVar.f46336d = this.f46336d;
        }
        boolean z = true;
        if (this.f46337e) {
            gVar.f46337e = true;
        }
        if (!TextUtils.isEmpty(this.f46338f)) {
            gVar.f46338f = this.f46338f;
        }
        if (this.f46339g) {
            gVar.f46339g = this.f46339g;
        }
        if (this.f46340h != 0.0d) {
            double d = this.f46340h;
            if (d < 0.0d || d > 100.0d) {
                z = false;
            }
            C15267r.m44395b(z, "Sample rate must be between 0% and 100%");
            gVar.f46340h = d;
        }
    }
}
