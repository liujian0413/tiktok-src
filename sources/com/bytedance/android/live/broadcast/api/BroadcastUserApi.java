package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.base.model.user.C2375g;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p264b.C6451b;
import com.bytedance.retrofit2.p264b.C6468s;
import p346io.reactivex.C7319aa;

public interface BroadcastUserApi {
    @C6468s(mo15750a = "/webcast/room/upload/image/")
    C7319aa<C3479d<C2375g>> uploadAvatar(@C6451b TypedOutput typedOutput);
}
