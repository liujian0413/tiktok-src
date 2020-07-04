package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C14931j;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.i */
public final class C16605i extends C14931j<C16605i> {

    /* renamed from: a */
    public String f46446a;

    /* renamed from: b */
    public String f46447b;

    /* renamed from: c */
    public String f46448c;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("network", this.f46446a);
        hashMap.put("action", this.f46447b);
        hashMap.put("target", this.f46448c);
        return m43370a((Object) hashMap);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37998a(C14931j jVar) {
        C16605i iVar = (C16605i) jVar;
        if (!TextUtils.isEmpty(this.f46446a)) {
            iVar.f46446a = this.f46446a;
        }
        if (!TextUtils.isEmpty(this.f46447b)) {
            iVar.f46447b = this.f46447b;
        }
        if (!TextUtils.isEmpty(this.f46448c)) {
            iVar.f46448c = this.f46448c;
        }
    }
}
