package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.ey */
final class C16516ey extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ C16514ew f46296a;

    C16516ey(C16514ew ewVar, Handler handler) {
        this.f46296a = ewVar;
        super(null);
    }

    public final void onChange(boolean z) {
        this.f46296a.mo42709b();
    }
}
