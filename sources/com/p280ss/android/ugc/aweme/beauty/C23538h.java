package com.p280ss.android.ugc.aweme.beauty;

import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;

/* renamed from: com.ss.android.ugc.aweme.beauty.h */
public final class C23538h {
    /* renamed from: a */
    public static final int m77304a(String str) {
        int i;
        if (str == null) {
            return -1;
        }
        try {
            i = Integer.parseInt(str);
        } catch (Throwable th) {
            C41530am.m132281a(th);
            i = -1;
        }
        return i;
    }
}
