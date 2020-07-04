package com.p280ss.android.ugc.aweme.mix;

import com.bytedance.jedi.model.p602d.C11800e;
import com.p280ss.android.ugc.aweme.mix.MixDetailApi.C33479a;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.mix.p */
public final class C33562p extends C11800e<C33563q, MixInfo> {

    /* renamed from: a */
    private final MixDetailApi f87658a = C33479a.m108258a();

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C7492s<MixInfo> mo29350a(C33563q qVar) {
        C7573i.m23587b(qVar, "req");
        return this.f87658a.getMixInfo(qVar.f87659a);
    }
}
