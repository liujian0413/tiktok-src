package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

final class avq extends ThreadLocal<SecureRandom> {
    avq() {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        return avp.m47383b();
    }
}
