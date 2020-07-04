package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C14931j;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.f */
public final class C16518f extends C14931j<C16518f> {

    /* renamed from: a */
    public String f46298a;

    /* renamed from: b */
    public boolean f46299b;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("description", this.f46298a);
        hashMap.put("fatal", Boolean.valueOf(this.f46299b));
        return m43370a((Object) hashMap);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37998a(C14931j jVar) {
        C16518f fVar = (C16518f) jVar;
        if (!TextUtils.isEmpty(this.f46298a)) {
            fVar.f46298a = this.f46298a;
        }
        if (this.f46299b) {
            fVar.f46299b = this.f46299b;
        }
    }
}
