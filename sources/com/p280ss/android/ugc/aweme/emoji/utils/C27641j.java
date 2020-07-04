package com.p280ss.android.ugc.aweme.emoji.utils;

import com.bytedance.common.utility.p482io.FileUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.emoji.emojichoose.model.Resources;
import com.taobao.android.dexposed.ClassUtils;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.j */
public final class C27641j {
    /* renamed from: a */
    private static String m90623a() {
        StringBuilder sb = new StringBuilder();
        sb.append(FileUtils.m28671a(C6399b.m19921a()));
        sb.append("/im_resources/");
        return sb.toString();
    }

    /* renamed from: c */
    public static String m90630c(Resources resources) {
        return m90629b(resources.getType(), resources.getId(), resources.getVersion());
    }

    /* renamed from: b */
    public static String m90628b(Resources resources) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getId());
        sb.append("_");
        if (resources.getVersion() == null) {
            str = null;
        } else {
            str = resources.getVersion().replace(ClassUtils.PACKAGE_SEPARATOR, "_");
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m90625a(Resources resources) {
        StringBuilder sb = new StringBuilder();
        sb.append(m90626a(resources.getType()));
        sb.append(m90624a(resources.getId(), resources.getVersion()));
        sb.append(".zip");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m90626a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(m90623a());
        sb.append(str);
        sb.append("/");
        return sb.toString();
    }

    /* renamed from: a */
    private static String m90624a(long j, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("_");
        if (str == null) {
            str2 = "";
        } else {
            str2 = str.replace(ClassUtils.PACKAGE_SEPARATOR, "_");
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    public static String m90629b(String str, long j, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(m90627a(str, j, str2));
        sb.append("/");
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m90627a(String str, long j, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(m90626a(str));
        sb.append(m90624a(j, str2));
        return sb.toString();
    }
}
