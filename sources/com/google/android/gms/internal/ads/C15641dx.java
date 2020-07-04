package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.dx */
final class C15641dx implements C15742hq<Object> {

    /* renamed from: a */
    final /* synthetic */ C15640dw f44371a;

    /* renamed from: b */
    private final /* synthetic */ C16075tz f44372b;

    C15641dx(C15640dw dwVar, C16075tz tzVar) {
        this.f44371a = dwVar;
        this.f44372b = tzVar;
    }

    /* renamed from: a */
    public final void mo37744a(Object obj, Map<String, String> map) {
        ami ami = (ami) this.f44371a.f44369a.get();
        if (ami == null) {
            this.f44372b.mo42007b("/loadHtml", this);
            return;
        }
        ami.mo39761w().mo39771a((anq) new C15642dy(this, map, this.f44372b));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            ami.loadData(str, "text/html", "UTF-8");
        } else {
            ami.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
        }
    }
}
