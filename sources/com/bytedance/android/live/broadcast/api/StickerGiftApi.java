package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.gift.model.C8133a;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface StickerGiftApi {
    @C6457h(mo15740a = "/webcast/gift/user_name/check/")
    C7492s<C3479d<C8133a>> checkUserNameLegality(@C6474y(mo15757a = "name") String str);
}
