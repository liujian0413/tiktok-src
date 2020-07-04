package com.bytedance.android.livesdk.live.api;

import com.bytedance.android.live.base.model.live.C2350a;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface DislikeApi {
    @C6457h(mo15740a = "/webcast/room/dislike/")
    C7492s<C3479d<C2350a>> dislikeRoom(@C6474y(mo15757a = "id") long j, @C6474y(mo15757a = "owner_uid") long j2, @C6474y(mo15757a = "request_id") String str, @C6474y(mo15757a = "enter_source") String str2, @C6474y(mo15757a = "source") String str3, @C6474y(mo15757a = "log_pb") String str4);
}
