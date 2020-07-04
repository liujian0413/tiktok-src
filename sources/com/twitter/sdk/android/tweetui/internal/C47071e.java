package com.twitter.sdk.android.tweetui.internal;

import com.C1642a;
import java.util.Locale;

/* renamed from: com.twitter.sdk.android.tweetui.internal.e */
final class C47071e {
    /* renamed from: a */
    static String m147169a(long j) {
        int i = (int) (j / 1000);
        int i2 = i % 60;
        int i3 = (i / 60) % 60;
        int i4 = i / 3600;
        if (i4 > 0) {
            return C1642a.m8035a(Locale.getDefault(), "%1$d:%2$02d:%3$02d", new Object[]{Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i2)});
        }
        return C1642a.m8035a(Locale.getDefault(), "%1$d:%2$02d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)});
    }
}
