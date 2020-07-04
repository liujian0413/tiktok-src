package com.bytedance.android.livesdkapi.p452h;

import android.util.LongSparseArray;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdkapi.h.k */
public final class C9423k {

    /* renamed from: a */
    private LongSparseArray<Room> f25906a;

    /* renamed from: com.bytedance.android.livesdkapi.h.k$a */
    static class C9425a {

        /* renamed from: a */
        public static C9423k f25907a = new C9423k();
    }

    /* renamed from: b */
    public static C9423k m27944b() {
        return C9425a.f25907a;
    }

    /* renamed from: a */
    public final void mo23120a() {
        this.f25906a.clear();
    }

    private C9423k() {
        this.f25906a = new LongSparseArray<>();
    }

    /* renamed from: a */
    public final Room mo23119a(long j) {
        return (Room) this.f25906a.get(j);
    }
}
