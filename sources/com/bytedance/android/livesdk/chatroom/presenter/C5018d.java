package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.event.C4420al;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.d */
final /* synthetic */ class C5018d implements C7326g {

    /* renamed from: a */
    private final C4967b f14277a;

    /* renamed from: b */
    private final C4420al f14278b;

    C5018d(C4967b bVar, C4420al alVar) {
        this.f14277a = bVar;
        this.f14278b = alVar;
    }

    public final void accept(Object obj) {
        this.f14277a.mo12961a(this.f14278b, (C3479d) obj);
    }
}
