package com.bytedance.android.live.broadcast.effect.sticker;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.o */
final /* synthetic */ class C2674o implements C7326g {

    /* renamed from: a */
    private final long f8500a;

    /* renamed from: b */
    private final Room f8501b;

    C2674o(long j, Room room) {
        this.f8500a = j;
        this.f8501b = room;
    }

    public final void accept(Object obj) {
        C2673n.m10881a(this.f8500a, this.f8501b, (C3479d) obj);
    }
}
