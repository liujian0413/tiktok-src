package com.bytedance.ies.bullet.kit.web.p550d;

import com.bytedance.ies.bullet.core.params.C10459b;
import com.bytedance.ies.bullet.core.params.C10463f;
import com.bytedance.ies.bullet.p551ui.common.params.C10697a;
import java.util.Map;
import kotlin.collections.C7525m;

/* renamed from: com.bytedance.ies.bullet.kit.web.d.c */
public final class C10637c extends C10697a {

    /* renamed from: b */
    public final C10463f<Boolean> f28488b = new C10459b("immersive_mode", false, 2, null);

    /* renamed from: c */
    public final C10463f<Boolean> f28489c = new C10459b("use_webview_title", false, 2, null);

    /* renamed from: d */
    private final Map<String, C10463f<?>> f28490d;

    /* renamed from: a */
    public final Map<String, C10463f<?>> mo25105a() {
        return this.f28490d;
    }

    public C10637c() {
        Map<String, C10463f<?>> a = super.mo25105a();
        for (C10463f fVar : C7525m.m23464b((T[]) new C10463f[]{this.f28488b, this.f28489c})) {
            a.put(fVar.mo25248a(), fVar);
        }
        this.f28490d = a;
    }
}
