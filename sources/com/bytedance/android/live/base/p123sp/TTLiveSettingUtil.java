package com.bytedance.android.live.base.p123sp;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.C6711m;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.concurrent.Callable;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p351i.C7333a;
import p346io.reactivex.p354j.C7486b;

/* renamed from: com.bytedance.android.live.base.sp.TTLiveSettingUtil */
public class TTLiveSettingUtil {
    public static C7486b<Boolean> update = C7486b.m23223a();

    public static void setLocalTest(boolean z) {
    }

    public static void updateSettings(Context context, C6711m mVar) {
        if (context != null && mVar != null) {
            SharedPreferences a = C7285c.m22838a(context, "ttlive_sdk_shared_pref_cache", 0);
            if (a != null) {
                C7492s.m23290a((Callable<? extends T>) new C2385b<Object>(a, mVar)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19325f(C2386c.f7875a);
            }
        }
    }
}
