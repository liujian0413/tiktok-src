package com.rocket.android.opensdk;

import com.rocket.android.opensdk.message.BaseReq;
import com.rocket.android.opensdk.message.BaseResp;

public interface IRocketAPIEventHandler {
    void onReq(BaseReq baseReq);

    void onResp(BaseResp baseResp);
}
