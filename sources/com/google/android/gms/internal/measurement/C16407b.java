package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.C14931j;
import com.google.android.gms.common.internal.C15267r;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.b */
public final class C16407b extends C14931j<C16407b> {

    /* renamed from: a */
    private final Map<String, Object> f45944a = new HashMap();

    public final String toString() {
        return m43370a((Object) this.f45944a);
    }

    /* renamed from: a */
    public final void mo42531a(String str, String str2) {
        C15267r.m44386a(str);
        if (str != null && str.startsWith("&")) {
            str = str.substring(1);
        }
        C15267r.m44387a(str, (Object) "Name can not be empty or \"&\"");
        this.f45944a.put(str, str2);
    }

    /* renamed from: a */
    public final Map<String, Object> mo42530a() {
        return Collections.unmodifiableMap(this.f45944a);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37998a(C14931j jVar) {
        C16407b bVar = (C16407b) jVar;
        C15267r.m44384a(bVar);
        bVar.f45944a.putAll(this.f45944a);
    }
}
