package com.bytedance.android.livesdk.chatroom.detail;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.detail.C4319b.C4320a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import p346io.reactivex.C7492s;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.m */
public final class C4338m extends C4319b {

    /* renamed from: c */
    public boolean f12641c;

    /* renamed from: d */
    private final long f12642d;

    /* renamed from: d */
    public final void mo12059d() {
        this.f12641c = true;
        mo11997a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C7492s<C3479d<Room>> mo12001c() {
        RoomRetrofitApi roomRetrofitApi = (RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class);
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(this.f12642d));
        hashMap.put("pack_level", "4");
        return roomRetrofitApi.fetchRoom(hashMap);
    }

    public C4338m(C4320a aVar, long j) {
        super(aVar);
        this.f12642d = j;
    }
}
