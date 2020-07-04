package com.zego.zegoavkit2.receiver;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

public final class AudioRouteMonitor extends BroadcastReceiver {
    public int mBluetoothOpSeq;
    private Context mContext;
    public long mThis;

    static native void onBluetoothConnected(long j, int i);

    static native void onWiredHeadsetPlugged(long j, int i);

    public final int uninit() {
        if (this.mContext == null) {
            return -1;
        }
        this.mContext.unregisterReceiver(this);
        this.mContext = null;
        return 0;
    }

    public final void setThis(long j) {
        this.mThis = j;
    }

    public final int init(Context context) {
        this.mContext = context;
        if (this.mContext == null) {
            return -1;
        }
        this.mBluetoothOpSeq = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        this.mContext.registerReceiver(this, intentFilter);
        try {
            if (BluetoothAdapter.getDefaultAdapter().getProfileConnectionState(1) == 2) {
                onBluetoothConnected(this.mThis, 1);
            } else {
                onBluetoothConnected(this.mThis, 0);
            }
        } catch (Exception unused) {
        }
        if (((AudioManager) this.mContext.getSystemService("audio")).isWiredHeadsetOn()) {
            onWiredHeadsetPlugged(this.mThis, 1);
        } else {
            onWiredHeadsetPlugged(this.mThis, 0);
        }
        return 0;
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.HEADSET_PLUG".equals(action)) {
            if (intent.hasExtra("state")) {
                onWiredHeadsetPlugged(this.mThis, intent.getIntExtra("state", 0));
            }
        } else if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
            if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE) == 10) {
                this.mBluetoothOpSeq++;
                onBluetoothConnected(this.mThis, 0);
            }
        } else if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(action)) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", Integer.MIN_VALUE);
            if (intExtra == 2) {
                this.mBluetoothOpSeq++;
                final int i = this.mBluetoothOpSeq;
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    public void run() {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException unused) {
                        }
                        if (AudioRouteMonitor.this.mBluetoothOpSeq == i) {
                            AudioRouteMonitor.onBluetoothConnected(AudioRouteMonitor.this.mThis, 1);
                        }
                    }
                }, 1000);
            } else if (intExtra == 0) {
                this.mBluetoothOpSeq++;
                onBluetoothConnected(this.mThis, 0);
            }
        }
    }
}
