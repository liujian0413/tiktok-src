package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface StatusApi {
    @C6457h(mo15740a = "/webcast/room/ping/anchor/")
    C7492s<C3479d<Void>> sendStatus(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "status") int i, @C6474y(mo15757a = "stream_id") long j2, @C6474y(mo15757a = "reason_no") int i2);
}
