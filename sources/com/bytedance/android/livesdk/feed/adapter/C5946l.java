package com.bytedance.android.livesdk.feed.adapter;

import android.arch.lifecycle.C0053p;
import com.bytedance.android.live.base.model.user.IUser.Status;

/* renamed from: com.bytedance.android.livesdk.feed.adapter.l */
final /* synthetic */ class C5946l implements C0053p {

    /* renamed from: a */
    private final C5933c f17624a;

    C5946l(C5933c cVar) {
        this.f17624a = cVar;
    }

    public final void onChanged(Object obj) {
        this.f17624a.mo14535a((Status) obj);
    }
}
