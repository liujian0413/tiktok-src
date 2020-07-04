package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.eu */
final class C16512eu extends ContentObserver {
    C16512eu(Handler handler) {
        super(null);
    }

    public final void onChange(boolean z) {
        C16511et.f46277e.set(true);
    }
}
