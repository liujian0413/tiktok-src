package com.p280ss.android.ugc.aweme.feed.preload;

import com.facebook.common.references.C13326a;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.request.ImageRequest;

/* renamed from: com.ss.android.ugc.aweme.feed.preload.f */
public final class C28660f extends C28653a<C13645c> {

    /* renamed from: b */
    public ImageRequest f75511b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo73715a(Object obj) throws Exception {
    }

    /* renamed from: e */
    public final boolean mo73723e() {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public C13645c mo73714a() throws Exception {
        if (this.f75511b != null && C13380c.m39173d()) {
            C13326a aVar = (C13326a) C13380c.m39172c().mo33172a(this.f75511b, (Object) null).mo32641d();
            if (aVar != null) {
                return (C13645c) aVar.mo32609a();
            }
        }
        return null;
    }
}
