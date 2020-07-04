package com.p280ss.android.ugc.aweme.emoji.utils;

import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.taobao.android.dexposed.ClassUtils;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.c */
public final class C27632c {
    /* renamed from: a */
    public static String m90587a() {
        StringBuilder sb = new StringBuilder();
        sb.append(C27641j.m90629b("STICKER", 0, "0"));
        sb.append("/animate/");
        return sb.toString();
    }

    /* renamed from: b */
    public static String m90590b() {
        StringBuilder sb = new StringBuilder();
        sb.append(C27641j.m90629b("STICKER", 0, "0"));
        sb.append("/static/");
        return sb.toString();
    }

    /* renamed from: c */
    public static String m90592c(Emoji emoji) {
        StringBuilder sb = new StringBuilder();
        sb.append(emoji.getId());
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(emoji.getAnimateType());
        return sb.toString();
    }

    /* renamed from: d */
    public static String m90593d(Emoji emoji) {
        StringBuilder sb = new StringBuilder();
        sb.append(emoji.getId());
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(emoji.getStaticType());
        return sb.toString();
    }

    /* renamed from: b */
    public static String m90591b(Emoji emoji) {
        return m90588a(emoji.getResourcesId(), emoji.getVersion(), emoji.getId(), emoji.getAnimateType());
    }

    /* renamed from: a */
    public static String m90589a(Emoji emoji) {
        StringBuilder sb = new StringBuilder();
        sb.append(C27641j.m90629b("STICKER", emoji.getResourcesId(), emoji.getVersion()));
        sb.append("/static/");
        sb.append(emoji.getId());
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(emoji.getStaticType());
        return sb.toString();
    }

    /* renamed from: a */
    public static String m90588a(long j, String str, long j2, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(C27641j.m90629b("STICKER", j, str));
        sb.append("/animate/");
        sb.append(j2);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(str2);
        return sb.toString();
    }
}
