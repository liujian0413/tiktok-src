package com.bytedance.android.livesdk.chatroom.interact.p216d;

import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.ba */
final /* synthetic */ class C4556ba implements C7326g {

    /* renamed from: a */
    private final C4549au f13172a;

    /* renamed from: b */
    private final RivalExtraInfo f13173b;

    /* renamed from: c */
    private final int f13174c;

    /* renamed from: d */
    private final Room f13175d;

    C4556ba(C4549au auVar, RivalExtraInfo rivalExtraInfo, int i, Room room) {
        this.f13172a = auVar;
        this.f13173b = rivalExtraInfo;
        this.f13174c = i;
        this.f13175d = room;
    }

    public final void accept(Object obj) {
        this.f13172a.mo12393a(this.f13173b, this.f13174c, this.f13175d, (Throwable) obj);
    }
}
