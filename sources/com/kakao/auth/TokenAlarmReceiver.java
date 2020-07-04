package com.kakao.auth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.PowerManager;
import com.kakao.util.helper.log.Logger;

public class TokenAlarmReceiver extends BroadcastReceiver {
    private boolean isApplicationActive(Context context) {
        try {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (VERSION.SDK_INT <= 19) {
                return powerManager.isScreenOn();
            }
            return powerManager.isInteractive();
        } catch (Exception unused) {
            return true;
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (isApplicationActive(context)) {
            try {
                Session.getCurrentSession().checkAccessTokenInfo();
            } catch (IllegalStateException e) {
                Logger.m60933e(e.toString());
            }
        }
    }
}
