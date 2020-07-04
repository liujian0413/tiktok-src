package com.p280ss.android.ugc.aweme.detail.operators;

import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.poi.rate.p1470a.C35203b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.z */
public final class C26175z extends C26117a<C35203b, C25674b<C35203b>> {

    /* renamed from: c */
    public final String f69008c;

    /* renamed from: d */
    public final int f69009d;

    /* renamed from: e */
    public final String f69010e;

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        C7573i.m23587b(feedParam, "feedParam");
        this.f68942b.mo56976a(Integer.valueOf(i));
    }

    public C26175z(String str, int i, String str2, C25673a<?, ?> aVar) {
        C35203b bVar;
        C7573i.m23587b(str, "spuId");
        C7573i.m23587b(str2, "poiId");
        this.f69008c = str;
        this.f69009d = i;
        this.f69010e = str2;
        if (aVar == null || !(aVar instanceof C35203b)) {
            bVar = new C35203b(this.f69008c, this.f69009d, this.f69010e);
        } else {
            bVar = (C35203b) aVar;
        }
        this.f68941a = bVar;
        this.f68942b = new C25674b();
    }
}
