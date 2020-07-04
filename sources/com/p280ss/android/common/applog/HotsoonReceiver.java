package com.p280ss.android.common.applog;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* renamed from: com.ss.android.common.applog.HotsoonReceiver */
public class HotsoonReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            String encodedSchemeSpecificPart = intent.getData().getEncodedSchemeSpecificPart();
            if (!TextUtils.isEmpty(encodedSchemeSpecificPart)) {
                UserInfo.getPackage(encodedSchemeSpecificPart);
            }
        } catch (Throwable unused) {
        }
    }
}
