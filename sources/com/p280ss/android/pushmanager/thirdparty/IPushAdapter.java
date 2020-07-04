package com.p280ss.android.pushmanager.thirdparty;

import android.content.Context;

/* renamed from: com.ss.android.pushmanager.thirdparty.IPushAdapter */
public interface IPushAdapter {
    boolean checkThirdPushConfig(String str, Context context) throws Exception;

    boolean isPushAvailable(Context context, int i);

    void registerPush(Context context, int i);

    void setAlias(Context context, String str, int i);

    void trackPush(Context context, int i, Object obj);

    void unregisterPush(Context context, int i);
}
