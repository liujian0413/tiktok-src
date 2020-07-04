package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.event.C4418aj;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.f */
final /* synthetic */ class C5020f implements C7326g {

    /* renamed from: a */
    private final C4967b f14281a;

    /* renamed from: b */
    private final C4418aj f14282b;

    C5020f(C4967b bVar, C4418aj ajVar) {
        this.f14281a = bVar;
        this.f14282b = ajVar;
    }

    public final void accept(Object obj) {
        this.f14281a.mo12959a(this.f14282b, (C3479d) obj);
    }
}
