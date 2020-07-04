package com.bytedance.ies.bullet.kit.web;

import com.bytedance.ies.bullet.core.kit.p541a.C10356b;
import com.bytedance.ies.bullet.core.kit.p541a.C10357c;
import com.bytedance.ies.bullet.core.kit.p541a.C10358d;
import java.util.List;
import java.util.Map;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.bytedance.ies.bullet.kit.web.b */
public final class C10626b extends C10357c<C10626b> {

    /* renamed from: a */
    public final C10356b<Boolean> f28474a;

    /* renamed from: b */
    public final C10356b<Boolean> f28475b;

    /* renamed from: c */
    public final C10356b<List<String>> f28476c;

    public C10626b() {
        this(null, null, null, 7, null);
    }

    /* renamed from: a */
    public final Map<String, C10356b<?>> mo25119a() {
        return C7507ae.m23393a((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a("hardwareAcceleration", this.f28474a), C7579l.m23633a("longClickable", this.f28475b), C7579l.m23633a("safeHosts", this.f28476c)});
    }

    private C10626b(Boolean bool, Boolean bool2, List<String> list) {
        this.f28474a = new C10358d(bool, false, 2, null);
        this.f28475b = new C10358d(bool2, false, 2, null);
        this.f28476c = new C10358d(list, false, 2, null);
    }

    public /* synthetic */ C10626b(Boolean bool, Boolean bool2, List list, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        this(bool, null, list);
    }
}
