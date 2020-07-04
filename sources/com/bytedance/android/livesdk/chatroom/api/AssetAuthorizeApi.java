package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface AssetAuthorizeApi {
    @C6468s(mo15750a = "/hotsoon/misc/authorize_assets")
    C7492s<C3479d<Object>> agreeAuthorize(@C6474y(mo15757a = "authorize") int i);

    @C6457h(mo15740a = "/hotsoon/misc/assets_authorize_tips")
    C7492s<C3479d<Object>> isShowAuthorizeTips();
}
