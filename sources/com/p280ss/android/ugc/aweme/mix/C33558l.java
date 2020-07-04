package com.p280ss.android.ugc.aweme.mix;

import com.bytedance.jedi.model.repository.C11994b;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.mix.l */
public final class C33558l extends C11994b {

    /* renamed from: a */
    private final C33562p f87655a = new C33562p();

    /* renamed from: b */
    private final C33565s f87656b = new C33565s();

    /* renamed from: a */
    public final C7492s<MixInfo> mo85893a(String str) {
        C7573i.m23587b(str, "mixId");
        C7492s<MixInfo> a = this.f87655a.mo29357c(new C33563q(str)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a());
        C7573i.m23582a((Object) a, "mMixInfoFetcher.request(…dSchedulers.mainThread())");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C7492s<MixList> m108429a(String str, long j, int i, int i2) {
        C33565s sVar = this.f87656b;
        C33568u uVar = new C33568u(str, j, i2, i);
        C7492s<MixList> a = sVar.mo29357c(uVar).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a());
        C7573i.m23582a((Object) a, "mMixListFetcher.request(…dSchedulers.mainThread())");
        return a;
    }
}
