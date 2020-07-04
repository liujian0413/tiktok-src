package com.bytedance.android.live.base.p123sp;

import android.content.SharedPreferences;
import com.google.gson.C6711m;
import java.util.concurrent.Callable;

/* renamed from: com.bytedance.android.live.base.sp.b */
final /* synthetic */ class C2385b implements Callable {

    /* renamed from: a */
    private final SharedPreferences f7873a;

    /* renamed from: b */
    private final C6711m f7874b;

    C2385b(SharedPreferences sharedPreferences, C6711m mVar) {
        this.f7873a = sharedPreferences;
        this.f7874b = mVar;
    }

    public final Object call() {
        return Boolean.valueOf(this.f7873a.edit().putString("key_ttlive_sdk_setting", this.f7874b.toString()).commit());
    }
}
