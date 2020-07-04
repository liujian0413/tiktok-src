package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.event.C4416ah;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.be */
final /* synthetic */ class C4978be implements C7326g {

    /* renamed from: a */
    private final C4973bd f14202a;

    C4978be(C4973bd bdVar) {
        this.f14202a = bdVar;
    }

    public final void accept(Object obj) {
        this.f14202a.onEvent((C4416ah) obj);
    }
}
