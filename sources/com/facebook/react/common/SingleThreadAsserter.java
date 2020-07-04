package com.facebook.react.common;

import com.facebook.infer.p728a.C13854a;

public class SingleThreadAsserter {
    private Thread mThread;

    public void assertNow() {
        boolean z;
        Thread currentThread = Thread.currentThread();
        if (this.mThread == null) {
            this.mThread = currentThread;
        }
        if (this.mThread == currentThread) {
            z = true;
        } else {
            z = false;
        }
        C13854a.m40914a(z);
    }
}
