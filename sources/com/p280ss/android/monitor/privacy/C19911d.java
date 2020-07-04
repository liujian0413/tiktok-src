package com.p280ss.android.monitor.privacy;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.monitor.privacy.d */
final /* synthetic */ class C19911d implements Callable {

    /* renamed from: a */
    private final Context f53965a;

    C19911d(Context context) {
        this.f53965a = context;
    }

    public final Object call() {
        return C6399b.m19924a(this.f53965a.getApplicationContext(), "build_timestamp");
    }
}
