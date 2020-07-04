package com.bytedance.android.livesdk.feed.live;

import com.bytedance.android.live.base.model.live.C2350a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.feed.live.h */
final /* synthetic */ class C6057h implements C7326g {

    /* renamed from: a */
    private final BaseLiveViewHolder f17945a;

    /* renamed from: b */
    private final Room f17946b;

    C6057h(BaseLiveViewHolder baseLiveViewHolder, Room room) {
        this.f17945a = baseLiveViewHolder;
        this.f17946b = room;
    }

    public final void accept(Object obj) {
        this.f17945a.mo14697a(this.f17946b, (C2350a) obj);
    }
}
