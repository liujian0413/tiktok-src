package com.bytedance.android.live.broadcast.effect.sticker;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.p */
final /* synthetic */ class C2675p implements C7326g {

    /* renamed from: a */
    private final long f8502a;

    /* renamed from: b */
    private final Room f8503b;

    C2675p(long j, Room room) {
        this.f8502a = j;
        this.f8503b = room;
    }

    public final void accept(Object obj) {
        C2673n.m10882a(this.f8502a, this.f8503b, (Throwable) obj);
    }
}
