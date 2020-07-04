package com.bytedance.android.livesdk.chatroom.interact.p216d;

import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.ay */
final /* synthetic */ class C4553ay implements C7326g {

    /* renamed from: a */
    private final C4549au f13164a;

    /* renamed from: b */
    private final RivalExtraInfo f13165b;

    /* renamed from: c */
    private final int f13166c;

    /* renamed from: d */
    private final Room f13167d;

    C4553ay(C4549au auVar, RivalExtraInfo rivalExtraInfo, int i, Room room) {
        this.f13164a = auVar;
        this.f13165b = rivalExtraInfo;
        this.f13166c = i;
        this.f13167d = room;
    }

    public final void accept(Object obj) {
        this.f13164a.mo12395b(this.f13165b, this.f13166c, this.f13167d, (Throwable) obj);
    }
}
