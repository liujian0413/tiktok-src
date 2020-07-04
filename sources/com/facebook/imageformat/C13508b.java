package com.facebook.imageformat;

import com.facebook.imageutils.C13846c;

/* renamed from: com.facebook.imageformat.b */
public final class C13508b {

    /* renamed from: a */
    public static final C13509c f35825a = new C13509c("JPEG", "jpeg");

    /* renamed from: b */
    public static final C13509c f35826b = new C13509c("PNG", "png");

    /* renamed from: c */
    public static final C13509c f35827c = new C13509c("GIF", "gif");

    /* renamed from: d */
    public static final C13509c f35828d = new C13509c("BMP", "bmp");

    /* renamed from: e */
    public static final C13509c f35829e = new C13509c("ICO", "ico");

    /* renamed from: f */
    public static final C13509c f35830f = new C13509c("WEBP_SIMPLE", "webp");

    /* renamed from: g */
    public static final C13509c f35831g = new C13509c("WEBP_LOSSLESS", "webp");

    /* renamed from: h */
    public static final C13509c f35832h = new C13509c("WEBP_EXTENDED", "webp");

    /* renamed from: i */
    public static final C13509c f35833i = new C13509c("WEBP_EXTENDED_WITH_ALPHA", "webp");

    /* renamed from: j */
    public static final C13509c f35834j = new C13509c("WEBP_ANIMATED", "webp");

    /* renamed from: k */
    public static final C13509c f35835k = new C13509c("HEIF", "heif");

    /* renamed from: l */
    public static final C13509c f35836l = null;

    /* renamed from: a */
    public static boolean m39751a(C13509c cVar) {
        if (m39752b(cVar) || cVar == f35834j) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m39753c(C13509c cVar) {
        if (cVar == C13846c.m40889a()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m39752b(C13509c cVar) {
        if (cVar == f35830f || cVar == f35831g || cVar == f35832h || cVar == f35833i) {
            return true;
        }
        return false;
    }
}
