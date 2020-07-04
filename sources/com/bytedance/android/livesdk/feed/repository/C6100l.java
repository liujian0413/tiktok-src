package com.bytedance.android.livesdk.feed.repository;

import com.bytedance.android.live.network.response.C3474a;
import com.bytedance.android.livesdk.feed.repository.FeedRepository.C6087a;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.bytedance.android.livesdk.feed.repository.l */
final /* synthetic */ class C6100l implements C7327h {

    /* renamed from: a */
    private final C6087a f18032a;

    /* renamed from: b */
    private final boolean f18033b;

    C6100l(C6087a aVar, boolean z) {
        this.f18032a = aVar;
        this.f18033b = z;
    }

    public final Object apply(Object obj) {
        return this.f18032a.mo14754a(this.f18033b, (C3474a) obj);
    }
}
