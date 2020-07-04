package com.twitter.sdk.android.core.internal.p1846b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.twitter.sdk.android.core.internal.b.c */
public final class C46862c implements C46861b {

    /* renamed from: a */
    private final SharedPreferences f120169a;

    /* renamed from: a */
    public final SharedPreferences mo117960a() {
        return this.f120169a;
    }

    /* renamed from: b */
    public final Editor mo117962b() {
        return this.f120169a.edit();
    }

    /* renamed from: a */
    public final boolean mo117961a(Editor editor) {
        editor.apply();
        return true;
    }

    public C46862c(Context context, String str) {
        if (context != null) {
            this.f120169a = C7285c.m22838a(context, str, 0);
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
