package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.presenter.C4973bd.C4977c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bo */
final /* synthetic */ class C4988bo implements C7326g {

    /* renamed from: a */
    private final C4973bd f14215a;

    /* renamed from: b */
    private final C4977c f14216b;

    C4988bo(C4973bd bdVar, C4977c cVar) {
        this.f14215a = bdVar;
        this.f14216b = cVar;
    }

    public final void accept(Object obj) {
        this.f14215a.mo12975a(this.f14216b, (C3479d) obj);
    }
}
