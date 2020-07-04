package com.bytedance.ies.bullet.core.kit;

import android.net.Uri;
import com.bytedance.ies.bullet.core.params.C10463f;
import com.bytedance.ies.bullet.core.params.C10467j;
import com.bytedance.ies.bullet.core.params.C10471n;
import com.bytedance.ies.bullet.core.params.C10481p;
import java.util.Map;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.collections.C7507ae;

/* renamed from: com.bytedance.ies.bullet.core.kit.s */
public final class C10398s extends C10471n {

    /* renamed from: a */
    public final C10463f<Uri> f28128a;

    /* renamed from: b */
    private final Map<String, C10463f<?>> f28129b = C7507ae.m23400b((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a(this.f28128a.mo25248a(), this.f28128a)});

    /* renamed from: a */
    public final Map<String, C10463f<?>> mo25105a() {
        return this.f28129b;
    }

    public C10398s() {
        C10467j jVar = new C10467j("prev_url", C10481p.m30861a(), null, 4, null);
        this.f28128a = jVar;
    }
}
