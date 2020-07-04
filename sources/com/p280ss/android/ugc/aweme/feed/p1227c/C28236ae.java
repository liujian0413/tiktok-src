package com.p280ss.android.ugc.aweme.feed.p1227c;

import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.playerkit.model.C44920d;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.c.ae */
final /* synthetic */ class C28236ae implements Callable {

    /* renamed from: a */
    private final Video f74388a;

    /* renamed from: b */
    private final C28130ac f74389b;

    /* renamed from: c */
    private final C44920d f74390c;

    C28236ae(Video video, C28130ac acVar, C44920d dVar) {
        this.f74388a = video;
        this.f74389b = acVar;
        this.f74390c = dVar;
    }

    public final Object call() {
        return C28256q.m92870a(this.f74388a, this.f74389b, this.f74390c);
    }
}
