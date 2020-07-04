package com.ttnet.org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class ProxyBroadcastReceiver extends BroadcastReceiver {
    private final ProxyChangeListener mListener;

    ProxyBroadcastReceiver(ProxyChangeListener proxyChangeListener) {
        this.mListener = proxyChangeListener;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
            this.mListener.updateProxyConfigFromConnectivityManager();
        }
    }
}
