package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class bcw implements Runnable {
    private bcw() {
    }

    public final void run() {
        try {
            bbd.f41355c = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
        } finally {
            bbd.f41353a.countDown();
        }
    }
}
