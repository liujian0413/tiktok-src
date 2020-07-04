package com.bytedance.android.livesdk.feed.adapter;

import android.arch.lifecycle.C0053p;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository.ApiDataStatus;

/* renamed from: com.bytedance.android.livesdk.feed.adapter.m */
final /* synthetic */ class C5947m implements C0053p {

    /* renamed from: a */
    private final C5933c f17625a;

    C5947m(C5933c cVar) {
        this.f17625a = cVar;
    }

    public final void onChanged(Object obj) {
        this.f17625a.mo14536a((ApiDataStatus) obj);
    }
}
