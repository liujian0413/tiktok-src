package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.c */
final /* synthetic */ class C5002c implements C7326g {

    /* renamed from: a */
    private final C4967b f14232a;

    C5002c(C4967b bVar) {
        this.f14232a = bVar;
    }

    public final void accept(Object obj) {
        this.f14232a.mo12958a((ISendCommentEvent) obj);
    }
}
