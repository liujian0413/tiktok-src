package com.p280ss.android.vesdk;

import android.graphics.Bitmap;
import com.p280ss.android.ttve.nativePort.TEVideoUtils;

/* renamed from: com.ss.android.vesdk.u */
public final class C45373u {

    /* renamed from: a */
    private volatile long f116883a;

    /* renamed from: a */
    public final synchronized void mo108606a() {
        TEVideoUtils.releaseGetFrameHandler(this.f116883a);
        this.f116883a = 0;
    }

    /* renamed from: a */
    public final synchronized void mo108607a(String str) {
        this.f116883a = TEVideoUtils.createGetFrameHandler(str);
    }

    /* renamed from: a */
    public final synchronized Bitmap mo108605a(int i, int i2, int i3, boolean z) throws VEException {
        if (this.f116883a == 0) {
            return null;
        }
        return TEVideoUtils.getFrameWithHandler(this.f116883a, i, -1, i3, z);
    }
}
