package com.p280ss.android.ugc.aweme.net;

import android.text.TextUtils;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.net.u */
public final class C34101u {
    /* renamed from: a */
    public static String m109776a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return ByteString.encodeUtf8(str).md5().hex();
    }
}
