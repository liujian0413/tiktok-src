package com.bytedance.ies.bullet.core.kit;

import android.net.Uri;
import android.net.Uri.Builder;
import com.bytedance.ies.bullet.core.model.pipeline.C10411e;
import com.bytedance.ies.bullet.core.model.pipeline.ResolvePolicy;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.core.kit.p */
public final class C10395p implements C10411e<C10397r> {

    /* renamed from: a */
    public static final C10395p f28124a = new C10395p();

    private C10395p() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo25189a(ResolvePolicy resolvePolicy, Object obj) {
        return m30770a(resolvePolicy, (C10397r) obj);
    }

    /* renamed from: a */
    private static C10397r m30770a(ResolvePolicy resolvePolicy, C10397r rVar) {
        C7573i.m23587b(resolvePolicy, "policy");
        C7573i.m23587b(rVar, "input");
        if (C10396q.f28125a[resolvePolicy.ordinal()] == 1) {
            return rVar;
        }
        C10354a aVar = new C10354a();
        aVar.mo25262a(Uri.class, rVar.f28126a);
        Uri uri = (Uri) aVar.f28066a.mo25251b();
        if (uri != null) {
            Builder buildUpon = uri.buildUpon();
            C7573i.m23582a((Object) buildUpon, "it.buildUpon()");
            Uri build = new C10399t(buildUpon).mo25193a(rVar.f28126a).mo25247b().build();
            if (build != null) {
                return new C10397r(build, rVar.f28127b);
            }
        }
        return rVar;
    }
}
