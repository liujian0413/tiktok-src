package com.bytedance.android.livesdk.chatroom.p220ui;

import com.bytedance.android.livesdk.message.model.C8512bh;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dc */
final /* synthetic */ class C5270dc implements C7326g {

    /* renamed from: a */
    private final C5260cv f15419a;

    /* renamed from: b */
    private final C8512bh f15420b;

    C5270dc(C5260cv cvVar, C8512bh bhVar) {
        this.f15419a = cvVar;
        this.f15420b = bhVar;
    }

    public final void accept(Object obj) {
        this.f15419a.mo13525a(this.f15420b, (FollowPair) obj);
    }
}
