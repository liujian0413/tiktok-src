package com.zego.zegoavkit2.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkStateChangeReceiver2 extends BroadcastReceiver {
    private Context mContext;
    private long mThis;

    static native void onNetTypeChanged(long j, int i);

    public int uninit() {
        if (this.mContext == null) {
            return -1;
        }
        this.mContext.unregisterReceiver(this);
        this.mContext = null;
        return 0;
    }

    public void setThis(long j) {
        this.mThis = j;
    }

    public int init(Context context) {
        this.mContext = context;
        if (this.mContext == null) {
            return -1;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.mContext.registerReceiver(this, intentFilter);
        onReceive(null, null);
        return 0;
    }

    public void onReceive(Context context, Intent intent) {
        if (this.mContext != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.mContext.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            }
            int i = 32;
            if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
                i = 0;
            } else {
                int type = networkInfo.getType();
                if (type != 9) {
                    switch (type) {
                        case 0:
                            switch (networkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                case 4:
                                case 7:
                                case 11:
                                    i = 3;
                                    break;
                                case 3:
                                case 5:
                                case 6:
                                case 8:
                                case 9:
                                case 10:
                                case 12:
                                case 14:
                                case 15:
                                    i = 4;
                                    break;
                                case 13:
                                    i = 5;
                                    break;
                            }
                        case 1:
                            i = 2;
                            break;
                    }
                } else {
                    i = 1;
                }
            }
            onNetTypeChanged(this.mThis, i);
        }
    }
}
