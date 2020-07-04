package com.bytedance.android.livesdk.feed.dislike;

import com.bytedance.android.live.base.model.live.C2350a;
import com.bytedance.android.live.network.response.C3479d;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.feed.dislike.a */
public final class C5972a {

    /* renamed from: a */
    private DislikeApi f17708a;

    public C5972a(DislikeApi dislikeApi) {
        this.f17708a = dislikeApi;
    }

    /* renamed from: a */
    static final /* synthetic */ C2350a m18678a(C3479d dVar) throws Exception {
        return (C2350a) dVar.data;
    }

    /* renamed from: a */
    public final C7492s<C2350a> mo14621a(long j, long j2, String str, String str2, String str3) {
        return this.f17708a.dislikeRoom(j, j2, str, str2, str2, str3).mo19317d(C5973b.f17709a).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a());
    }
}
