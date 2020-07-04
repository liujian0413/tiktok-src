package com.bytedance.android.livesdk.chatroom.detail;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.detail.C4319b.C4320a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import p346io.reactivex.C7492s;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.n */
public final class C4339n extends C4319b {

    /* renamed from: c */
    private final long f12643c;

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C7492s<C3479d<Room>> mo12001c() {
        return ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).fetchUserRoom(this.f12643c, TTLiveSDKContext.getHostService().mo22367h().mo22172a(this.f12643c));
    }

    public C4339n(C4320a aVar, long j) {
        super(aVar);
        this.f12643c = j;
    }
}
