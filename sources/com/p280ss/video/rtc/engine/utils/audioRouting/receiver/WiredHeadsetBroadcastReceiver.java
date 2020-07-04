package com.p280ss.video.rtc.engine.utils.audioRouting.receiver;

import android.content.Context;
import android.content.Intent;
import com.p280ss.video.rtc.engine.utils.LogUtil;
import com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.WiredHeadsetDeviceManager;
import com.p280ss.video.rtc.engine.utils.audioRouting.receiver.base.BaseAudioDeviceBroadcastReceiver;

/* renamed from: com.ss.video.rtc.engine.utils.audioRouting.receiver.WiredHeadsetBroadcastReceiver */
public class WiredHeadsetBroadcastReceiver extends BaseAudioDeviceBroadcastReceiver {
    private WiredHeadsetDeviceManager mDeviceManager;

    public WiredHeadsetBroadcastReceiver(WiredHeadsetDeviceManager wiredHeadsetDeviceManager) {
        this.mDeviceManager = wiredHeadsetDeviceManager;
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction()) && intent.hasExtra("state")) {
            int intExtra = intent.getIntExtra("state", -1);
            if (intExtra == 1) {
                if (intent.getIntExtra("microphone", -1) == 1) {
                    LogUtil.m145281i("WiredHeadsetBroadcastReceiver", "Headset w/ mic connected");
                    this.mDeviceManager.onDeviceOnline();
                    this.mDeviceManager.reportHeadsetType(0);
                } else {
                    this.mDeviceManager.onDeviceOnline();
                    this.mDeviceManager.reportHeadsetType(1);
                    LogUtil.m145281i("WiredHeadsetBroadcastReceiver", "Headset w/o mic connected");
                }
            } else if (intExtra == 0) {
                LogUtil.m145281i("WiredHeadsetBroadcastReceiver", "Headset disconnected");
                this.mDeviceManager.onDeviceOffline();
            } else {
                StringBuilder sb = new StringBuilder("Headset unknown event detected, state=");
                sb.append(intExtra);
                LogUtil.m145281i("WiredHeadsetBroadcastReceiver", sb.toString());
            }
        }
    }
}
