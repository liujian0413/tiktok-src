package com.bytedance.ies.bullet.kit.p261rn.p545b;

import com.bytedance.ies.bullet.core.params.C10458a;
import com.bytedance.ies.bullet.core.params.C10459b;
import com.bytedance.ies.bullet.core.params.C10461d;
import com.bytedance.ies.bullet.core.params.C10463f;
import com.bytedance.ies.bullet.core.params.C10466i;
import com.bytedance.ies.bullet.core.params.C10467j;
import com.bytedance.ies.bullet.core.params.C10469l;
import com.bytedance.ies.bullet.p551ui.common.params.C10697a;
import java.util.Map;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.bytedance.ies.bullet.kit.rn.b.c */
public final class C10491c extends C10697a {

    /* renamed from: B */
    private final Map<String, C10463f<?>> f28220B;

    /* renamed from: b */
    public final C10463f<String> f28221b = new C10458a(null, 1, null);

    /* renamed from: c */
    public final C10463f<String> f28222c = new C10461d(null, 1, null);

    /* renamed from: d */
    public C10463f<String> f28223d = new C10466i(null, 1, null);

    /* renamed from: e */
    public final C10463f<Boolean> f28224e = new C10459b("force_h5", false, 2, null);

    /* renamed from: f */
    public final C10463f<Boolean> f28225f = new C10459b("dev", false, 2, null);

    /* renamed from: g */
    public final C10463f<String> f28226g;

    /* renamed from: h */
    public final C10463f<Boolean> f28227h;

    /* renamed from: i */
    public final C10463f<String> f28228i;

    /* renamed from: a */
    public final Map<String, C10463f<?>> mo25105a() {
        return this.f28220B;
    }

    /* renamed from: b */
    public final boolean mo25283b() {
        boolean z;
        if (C7573i.m23585a((Object) (Boolean) this.f28225f.mo25251b(), (Object) Boolean.valueOf(true))) {
            CharSequence charSequence = (CharSequence) this.f28226g.mo25251b();
            if (charSequence == null || C7634n.m23713a(charSequence)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    public C10491c() {
        C10467j jVar = new C10467j("rn_bundle_url", C10469l.m30845f(), null, 4, null);
        this.f28226g = jVar;
        this.f28227h = new C10459b("dynamic", false, 2, null);
        C10467j jVar2 = new C10467j("a_surl", C10469l.m30845f(), null, 4, null);
        this.f28228i = jVar2;
        Map<String, C10463f<?>> a = super.mo25105a();
        for (C10463f fVar : C7525m.m23464b((T[]) new C10463f[]{this.f28221b, this.f28223d, this.f28222c, this.f28224e, this.f28225f, this.f28226g, this.f28227h, this.f28228i})) {
            a.put(fVar.mo25248a(), fVar);
        }
        this.f28220B = a;
    }
}
