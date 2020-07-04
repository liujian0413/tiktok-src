package com.p280ss.android.ugc.aweme.feed.p1227c;

import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.playerkit.model.C44919c;

/* renamed from: com.ss.android.ugc.aweme.feed.c.ag */
final /* synthetic */ class C28238ag implements Runnable {

    /* renamed from: a */
    private final C28256q f74395a;

    /* renamed from: b */
    private final C44919c f74396b;

    /* renamed from: c */
    private final Video f74397c;

    /* renamed from: d */
    private final C28130ac f74398d;

    C28238ag(C28256q qVar, C44919c cVar, Video video, C28130ac acVar) {
        this.f74395a = qVar;
        this.f74396b = cVar;
        this.f74397c = video;
        this.f74398d = acVar;
    }

    public final void run() {
        this.f74395a.mo71924a(this.f74396b, this.f74397c, this.f74398d);
    }
}
