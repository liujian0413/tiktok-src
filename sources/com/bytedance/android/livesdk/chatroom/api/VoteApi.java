package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.model.C4890aw;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface VoteApi {
    @C6457h(mo15740a = "/webcast/gift/vote/list/")
    C7492s<C3479d<C4890aw>> listVote(@C6474y(mo15757a = "room_id") String str, @C6474y(mo15757a = "vote_id") String str2);
}
