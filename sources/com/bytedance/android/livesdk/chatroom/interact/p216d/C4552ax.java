package com.bytedance.android.livesdk.chatroom.interact.p216d;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.ax */
final /* synthetic */ class C4552ax implements C7326g {

    /* renamed from: a */
    private final C4549au f13161a;

    /* renamed from: b */
    private final RivalExtraInfo f13162b;

    /* renamed from: c */
    private final int f13163c;

    C4552ax(C4549au auVar, RivalExtraInfo rivalExtraInfo, int i) {
        this.f13161a = auVar;
        this.f13162b = rivalExtraInfo;
        this.f13163c = i;
    }

    public final void accept(Object obj) {
        this.f13161a.mo12394b(this.f13162b, this.f13163c, (C3479d) obj);
    }
}
