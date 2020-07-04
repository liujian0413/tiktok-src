package com.p280ss.android.ugc.aweme.profile.api;

import com.p280ss.android.ugc.aweme.profile.model.RoomResponse;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.profile.api.RoomRetrofitApi */
public interface RoomRetrofitApi {
    @C7730f(mo20420a = "/webcast/room/info/")
    C7492s<RoomResponse> roomInfo(@C7744t(mo20436a = "room_id") long j, @C7744t(mo20436a = "pack_level") int i);
}
