package com.bytedance.android.livesdk.player.api;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p264b.C6451b;
import com.bytedance.retrofit2.p264b.C6468s;
import p346io.reactivex.C7492s;

public interface LivePlayerLogApi {
    @C6468s(mo15750a = "/webcast/stats/")
    C7492s<C3479d<Void>> sendLiveLog(@C6451b TypedOutput typedOutput);
}
