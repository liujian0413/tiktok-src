package com.rocket.android.opensdk;

import android.content.Intent;
import com.rocket.android.opensdk.message.BaseReq;

public interface IRocketAPI {
    int getRocketSupportSDKVersion();

    boolean handleIntent(Intent intent, IRocketAPIEventHandler iRocketAPIEventHandler);

    boolean isRocketInstalled();

    boolean isRocketSupportAPI();

    boolean openRocketApp();

    boolean sendReq(BaseReq baseReq);

    boolean sendResp(BaseReq baseReq);
}
