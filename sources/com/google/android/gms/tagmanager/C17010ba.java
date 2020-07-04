package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.google.android.gms.tagmanager.ba */
final class C17010ba {
    /* renamed from: a */
    static void m56481a(Context context, String str, String str2, String str3) {
        Editor edit = C7285c.m22838a(context, str, 0).edit();
        edit.putString(str2, str3);
        edit.apply();
    }
}
