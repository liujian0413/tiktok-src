package com.snapchat.kit.sdk.core.security;

import android.content.Context;
import com.C1642a;

public class Fingerprint {

    /* renamed from: a */
    private final String f50491a;

    private native String sign(String str);

    /* renamed from: a */
    public final synchronized String mo49182a() {
        return sign(m61239b());
    }

    /* renamed from: b */
    private String m61239b() {
        return C1642a.m8034a("%s:%d", new Object[]{this.f50491a, Long.valueOf(System.currentTimeMillis())});
    }

    public Fingerprint(Context context) {
        C18691a.m61241a("pruneau");
        this.f50491a = context.getPackageName();
    }
}
