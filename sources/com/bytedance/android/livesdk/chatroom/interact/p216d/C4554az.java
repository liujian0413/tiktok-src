package com.bytedance.android.livesdk.chatroom.interact.p216d;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.az */
final /* synthetic */ class C4554az implements C7326g {

    /* renamed from: a */
    private final C4549au f13168a;

    /* renamed from: b */
    private final RivalExtraInfo f13169b;

    /* renamed from: c */
    private final int f13170c;

    C4554az(C4549au auVar, RivalExtraInfo rivalExtraInfo, int i) {
        this.f13168a = auVar;
        this.f13169b = rivalExtraInfo;
        this.f13170c = i;
    }

    public final void accept(Object obj) {
        this.f13168a.mo12392a(this.f13169b, this.f13170c, (C3479d) obj);
    }
}
