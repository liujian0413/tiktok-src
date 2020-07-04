package com.google.android.gms.internal.ads;

import android.database.ContentObserver;
import android.os.Handler;

final class bti extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ btf f43545a;

    public bti(btf btf, Handler handler) {
        this.f43545a = btf;
        super(handler);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        this.f43545a.mo41288a();
    }
}
