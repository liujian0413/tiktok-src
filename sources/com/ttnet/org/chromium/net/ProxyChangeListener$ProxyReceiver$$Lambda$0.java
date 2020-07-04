package com.ttnet.org.chromium.net;

import android.content.Intent;

final /* synthetic */ class ProxyChangeListener$ProxyReceiver$$Lambda$0 implements Runnable {
    private final ProxyReceiver arg$1;
    private final Intent arg$2;

    ProxyChangeListener$ProxyReceiver$$Lambda$0(ProxyReceiver proxyReceiver, Intent intent) {
        this.arg$1 = proxyReceiver;
        this.arg$2 = intent;
    }

    public final void run() {
        this.arg$1.lambda$onReceive$0$ProxyChangeListener$ProxyReceiver(this.arg$2);
    }
}
