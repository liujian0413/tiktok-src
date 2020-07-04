package com.bytedance.android.livesdk.chatroom.p209bl;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.p280ss.android.common.util.NetworkUtils;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.f */
public final class C4274f {
    /* renamed from: a */
    public static String m14433a(String str) throws Exception {
        return NetworkUtils.executeGet(0, str, false, false, null, null, false);
    }

    /* renamed from: a */
    public static Room m14431a(boolean z, long j, int i) throws Exception {
        C3479d dVar = (C3479d) ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).getRoomStats(z, j, i).execute().f33302b;
        if (dVar.extra != null) {
            ((Room) dVar.data).nowTime = dVar.extra.now / 1000;
        }
        return (Room) dVar.data;
    }

    /* renamed from: a */
    public static Room m14432a(boolean z, long j, int i, boolean z2, int i2) throws Exception {
        C3479d dVar = (C3479d) ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).getRoomStats(z, j, i, z2, i2).execute().f33302b;
        if (dVar.extra != null) {
            ((Room) dVar.data).nowTime = dVar.extra.now / 1000;
        }
        return (Room) dVar.data;
    }
}
