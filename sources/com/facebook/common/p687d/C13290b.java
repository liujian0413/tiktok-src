package com.facebook.common.p687d;

import android.webkit.MimeTypeMap;
import com.facebook.common.internal.ImmutableMap;
import java.util.Map;

/* renamed from: com.facebook.common.d.b */
public final class C13290b {

    /* renamed from: a */
    private static final MimeTypeMap f35186a = MimeTypeMap.getSingleton();

    /* renamed from: b */
    private static final Map<String, String> f35187b = ImmutableMap.m38918of("image/heif", "heif", "image/heic", "heic");

    /* renamed from: c */
    private static final Map<String, String> f35188c = ImmutableMap.m38918of("heif", "image/heif", "heic", "image/heic");

    /* renamed from: a */
    public static String m38895a(String str) {
        String str2 = (String) f35188c.get(str);
        if (str2 != null) {
            return str2;
        }
        return f35186a.getMimeTypeFromExtension(str);
    }
}
