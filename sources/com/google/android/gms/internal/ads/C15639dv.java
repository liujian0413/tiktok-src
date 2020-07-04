package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.dv */
public final class C15639dv implements C15742hq<Object> {

    /* renamed from: a */
    private final WeakReference<C15635dr> f44367a;

    /* renamed from: b */
    private final String f44368b;

    public C15639dv(C15635dr drVar, String str) {
        this.f44367a = new WeakReference<>(drVar);
        this.f44368b = str;
    }

    /* renamed from: a */
    public final void mo37744a(Object obj, Map<String, String> map) {
        String str = (String) map.get("ads_id");
        String str2 = (String) map.get("eventName");
        if (!TextUtils.isEmpty(str) && this.f44368b.equals(str)) {
            if ("_ai".equals(str2)) {
                C15635dr drVar = (C15635dr) this.f44367a.get();
                if (drVar != null) {
                    drVar.mo41608v();
                }
            } else if ("_ac".equals(str2)) {
                C15635dr drVar2 = (C15635dr) this.f44367a.get();
                if (drVar2 != null) {
                    drVar2.mo41610w();
                }
            }
        }
    }
}
