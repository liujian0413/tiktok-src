package com.p280ss.android.pushmanager.thirdparty;

import android.content.Context;

/* renamed from: com.ss.android.pushmanager.thirdparty.ISendTokenCallBack */
public interface ISendTokenCallBack {
    String getToken(Context context);

    int getType();
}
