package com.bytedance.android.livesdk.verify;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.retrofit2.p264b.C6454e;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6468s;
import p346io.reactivex.C7492s;

public interface HotsoonVerifyApi {
    @C6456g
    @C6468s(mo15750a = "https://hotsoon.snssdk.com/hotsoon/user/realname_reset/")
    C7492s<C3479d<Void>> unbindOldWithdrawAccount(@C6454e(mo15737a = "set_uniq_realname") String str);
}
