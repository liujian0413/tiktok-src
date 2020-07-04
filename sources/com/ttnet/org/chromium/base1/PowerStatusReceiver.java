package com.ttnet.org.chromium.base1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class PowerStatusReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        PowerMonitor.onBatteryChargingChanged(intent);
    }
}
