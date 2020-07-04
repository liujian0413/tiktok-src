package com.google.android.gms.internal.ads;

import android.text.TextUtils;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.cc */
public final class C15592cc {
    /* renamed from: a */
    public static void m50344a(C15588bz bzVar, C15587by byVar) {
        if (byVar.f44158c == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(byVar.f44159d)) {
            bzVar.mo41447a(byVar.f44158c, byVar.f44159d, byVar.f44156a, byVar.f44157b);
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
