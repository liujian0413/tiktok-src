package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.api.model.DutyGiftInfo;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface DutyGiftAPi {
    @C6457h(mo15740a = "/webcast/gift/duty_gift/")
    C7492s<C3479d<DutyGiftInfo>> dutyGiftRequest(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "anchor_id") long j2, @C6474y(mo15757a = "op_type") long j3, @C6474y(mo15757a = "is_cut_short") boolean z);
}
