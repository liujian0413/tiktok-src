package com.bytedance.ies.bullet.core.kit;

import android.net.Uri;
import android.net.Uri.Builder;
import com.bytedance.ies.bullet.core.params.C10471n;
import com.bytedance.ies.bullet.core.params.C10482q;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.core.kit.t */
public final class C10399t extends C10482q<C10399t, C10398s> {

    /* renamed from: a */
    public final C10398s f28130a = new C10398s();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C10471n mo25109a() {
        return this.f28130a;
    }

    public C10399t(Builder builder) {
        C7573i.m23587b(builder, "uriBuilder");
        super(builder);
    }

    /* renamed from: a */
    public final C10399t mo25193a(Uri uri) {
        C7573i.m23587b(uri, "prevUri");
        this.f28130a.f28128a.mo25250a(uri);
        return this;
    }
}
