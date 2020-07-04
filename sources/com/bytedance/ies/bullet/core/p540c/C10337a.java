package com.bytedance.ies.bullet.core.p540c;

import android.net.Uri;
import com.bytedance.ies.bullet.core.params.C10463f;
import com.bytedance.ies.bullet.core.params.C10467j;
import com.bytedance.ies.bullet.core.params.C10469l;
import com.bytedance.ies.bullet.core.params.C10471n;
import com.bytedance.ies.bullet.core.params.C10481p;
import java.util.List;
import java.util.Map;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.collections.C7507ae;

/* renamed from: com.bytedance.ies.bullet.core.c.a */
public final class C10337a extends C10471n {

    /* renamed from: a */
    public final C10463f<List<String>> f28043a;

    /* renamed from: b */
    public final C10463f<Uri> f28044b;

    /* renamed from: c */
    private final Map<String, C10463f<?>> f28045c = C7507ae.m23400b((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a(this.f28043a.mo25248a(), this.f28043a), C7579l.m23633a(this.f28044b.mo25248a(), this.f28044b)});

    /* renamed from: a */
    public final Map<String, C10463f<?>> mo25105a() {
        return this.f28045c;
    }

    public C10337a() {
        C10467j jVar = new C10467j("packages", C10469l.m30846g(), null, 4, null);
        this.f28043a = jVar;
        C10467j jVar2 = new C10467j("url", C10481p.m30861a(), null, 4, null);
        this.f28044b = jVar2;
    }
}
