package com.bytedance.opensdk.core.base.p625a;

import android.content.Intent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.opensdk.core.base.a.a */
public final class C12304a {

    /* renamed from: a */
    private final Map<Integer, C12305b> f32664a = new LinkedHashMap();

    /* renamed from: a */
    public final void mo30104a() {
        this.f32664a.clear();
    }

    /* renamed from: a */
    public final void mo30106a(int i, C12305b bVar) {
        C7573i.m23587b(bVar, "callback");
        this.f32664a.put(Integer.valueOf(i), bVar);
    }

    /* renamed from: a */
    public final void mo30105a(int i, int i2, Intent intent) {
        C12305b bVar = (C12305b) this.f32664a.get(Integer.valueOf(i));
        if (bVar != null) {
            bVar.mo30079a(i, i2, intent);
        }
    }
}
