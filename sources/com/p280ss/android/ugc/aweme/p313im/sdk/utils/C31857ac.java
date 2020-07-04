package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ac */
public final class C31857ac {
    /* renamed from: b */
    public static String m103403b() {
        Locale a = m103402a();
        if (a == null) {
            return "";
        }
        return a.getLanguage();
    }

    /* renamed from: c */
    public static boolean m103404c() {
        return TextUtils.equals(Locale.CHINESE.getLanguage(), m103403b());
    }

    /* renamed from: a */
    public static Locale m103402a() {
        if (VERSION.SDK_INT >= 24) {
            return C6399b.m19921a().getResources().getConfiguration().getLocales().get(0);
        }
        return C6399b.m19921a().getResources().getConfiguration().locale;
    }

    /* renamed from: d */
    public static boolean m103405d() {
        if (TextUtils.equals(Locale.getDefault().getLanguage(), Locale.CHINESE.getLanguage()) || TextUtils.equals(Locale.getDefault().getLanguage(), Locale.ENGLISH.getLanguage())) {
            return true;
        }
        return false;
    }
}
