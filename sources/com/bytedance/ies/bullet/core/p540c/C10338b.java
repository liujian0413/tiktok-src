package com.bytedance.ies.bullet.core.p540c;

import android.net.Uri;
import android.net.Uri.Builder;
import com.bytedance.ies.bullet.core.params.C10462e;
import com.bytedance.ies.bullet.core.params.C10471n;
import com.bytedance.ies.bullet.core.params.C10482q;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.core.c.b */
public final class C10338b extends C10482q<C10338b, C10337a> {

    /* renamed from: a */
    public final C10337a f28046a = new C10337a();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C10471n mo25109a() {
        return this.f28046a;
    }

    public C10338b() {
        Builder authority = new Builder().scheme("bullet").authority("bullet");
        C7573i.m23582a((Object) authority, "Uri.Builder().scheme(\"bullet\").authority(\"bullet\")");
        super(authority);
    }

    /* renamed from: a */
    public final C10338b mo25106a(Uri uri) {
        C7573i.m23587b(uri, "uri");
        this.f28046a.f28044b.mo25250a(uri);
        return this;
    }

    /* renamed from: a */
    public final C10338b mo25107a(C10462e<Builder> eVar) {
        C7573i.m23587b(eVar, "builder");
        this.f28046a.f28044b.mo25250a(((Builder) eVar.mo25247b()).build());
        return this;
    }

    /* renamed from: a */
    public final C10338b mo25108a(List<String> list) {
        C7573i.m23587b(list, "packages");
        this.f28046a.f28043a.mo25250a(list);
        return this;
    }
}
