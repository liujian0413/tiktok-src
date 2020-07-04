package com.bytedance.android.livesdk.kickout.api;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.kickout.p399b.C8371a;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface BannedApiV2 {
    @C6457h(mo15740a = "/webcast/room/silence/list/")
    C7492s<C8371a> getBannedTalkList(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "count") int i, @C6474y(mo15757a = "offset") int i2, @C6474y(mo15757a = "sec_user_id") String str);

    @C6457h(mo15740a = "/webcast/room/kick/list/")
    C7492s<C8371a> getKickedOutList(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "count") int i, @C6474y(mo15757a = "offset") int i2, @C6474y(mo15757a = "sec_user_id") String str);

    @C6457h(mo15740a = "/webcast/room/kick/user/")
    C7492s<C3479d<Void>> kickOut(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "kick_uid") long j2);

    @C6457h(mo15740a = "/webcast/room/unkick/user/")
    C7492s<C3479d<Void>> unKickOut(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "kick_uid") long j2);
}
