package com.google.android.gms.internal.ads;

import android.os.Looper;

final class aig implements Runnable {
    aig(aif aif) {
    }

    public final void run() {
        Looper.myLooper().quit();
    }
}
