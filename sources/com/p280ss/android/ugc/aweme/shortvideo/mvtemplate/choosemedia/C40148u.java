package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.u */
final /* synthetic */ class C40148u implements Callable {

    /* renamed from: a */
    private final MvImageAlbumAdapter f104348a;

    /* renamed from: b */
    private final boolean f104349b;

    /* renamed from: c */
    private final int f104350c;

    /* renamed from: d */
    private final List f104351d;

    C40148u(MvImageAlbumAdapter mvImageAlbumAdapter, boolean z, int i, List list) {
        this.f104348a = mvImageAlbumAdapter;
        this.f104349b = z;
        this.f104350c = i;
        this.f104351d = list;
    }

    public final Object call() {
        return this.f104348a.mo99840a(this.f104349b, this.f104350c, this.f104351d);
    }
}
