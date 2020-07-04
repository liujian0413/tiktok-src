package com.bytedance.android.livesdk.feed.repository;

import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.p145a.C3158n;

/* renamed from: com.bytedance.android.livesdk.feed.repository.f */
final /* synthetic */ class C6094f implements C3158n {

    /* renamed from: a */
    private final String f18026a;

    C6094f(String str) {
        this.f18026a = str;
    }

    /* renamed from: a */
    public final boolean mo9997a(Object obj) {
        return FeedRepository.m18991a(this.f18026a, (FeedItem) obj);
    }
}
