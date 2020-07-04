package com.example.leakinterface;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.example.leakinterface.e */
public final class C13076e {

    /* renamed from: a */
    public static final C13076e f34618a = new C13076e();

    private C13076e() {
    }

    /* renamed from: a */
    public static void m38224a(Context context, boolean z) {
        if (context != null) {
            SharedPreferences a = C7285c.m22838a(context, "LeakDetectorSp", 0);
            if (a != null) {
                Editor edit = a.edit();
                if (edit != null) {
                    Editor putBoolean = edit.putBoolean("open_leak_detector_on_local_test", z);
                    if (putBoolean != null) {
                        putBoolean.commit();
                    }
                }
            }
        }
    }
}
