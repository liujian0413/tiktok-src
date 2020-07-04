package com.p280ss.avframework.livestreamv2.effectcamera.utils;

import android.text.TextUtils;
import android.util.Log;
import com.C1642a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.util.regex.Pattern;

/* renamed from: com.ss.avframework.livestreamv2.effectcamera.utils.LogUtils */
public class LogUtils {
    private static final Pattern DATE_CLEANUP_PATTERN_WRONG_TIMEZONE = Pattern.compile("GMT([-+]\\d{4})$");
    private static Boolean sDebugLoggingEnabledForTests = null;
    private static boolean sIsLoggable = false;

    public static void setIsLoggable(boolean z) {
        sIsLoggable = z;
    }

    public static String byteToHex(int i) {
        return byteToHex(new StringBuilder(), i).toString();
    }

    public static String cleanUpMimeDate(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return DATE_CLEANUP_PATTERN_WRONG_TIMEZONE.matcher(str).replaceFirst("$1");
    }

    public static boolean isLoggable(String str, int i) {
        return sIsLoggable;
    }

    public static StringBuilder byteToHex(StringBuilder sb, int i) {
        int i2 = i & NormalGiftView.ALPHA_255;
        sb.append("0123456789ABCDEF".charAt(i2 >> 4));
        sb.append("0123456789ABCDEF".charAt(i2 & 15));
        return sb;
    }

    /* renamed from: d */
    public static int m143679d(String str, Object... objArr) {
        if (isLoggable("bytedance", 3)) {
            return Log.d("bytedance", C1642a.m8034a(str, objArr));
        }
        return 0;
    }

    /* renamed from: e */
    public static int m143682e(String str, Object... objArr) {
        if (isLoggable("bytedance", 6)) {
            return Log.e("bytedance", C1642a.m8034a(str, objArr));
        }
        return 0;
    }

    /* renamed from: i */
    public static int m143685i(String str, Object... objArr) {
        if (isLoggable("bytedance", 4)) {
            return Log.i("bytedance", C1642a.m8034a(str, objArr));
        }
        return 0;
    }

    /* renamed from: v */
    public static int m143688v(String str, Object... objArr) {
        if (isLoggable("bytedance", 2)) {
            return Log.v("bytedance", C1642a.m8034a(str, objArr));
        }
        return 0;
    }

    public static int wtf(String str, String str2, Object... objArr) {
        return Log.wtf(str, C1642a.m8034a(str2, objArr), new Error());
    }

    /* renamed from: d */
    public static int m143677d(String str, String str2, Object... objArr) {
        if (isLoggable(str, 3)) {
            return Log.d(str, C1642a.m8034a(str2, objArr));
        }
        return 0;
    }

    /* renamed from: e */
    public static int m143680e(String str, String str2, Object... objArr) {
        if (isLoggable(str, 6)) {
            return Log.e(str, C1642a.m8034a(str2, objArr));
        }
        return 0;
    }

    /* renamed from: i */
    public static int m143683i(String str, String str2, Object... objArr) {
        if (isLoggable(str, 4)) {
            return Log.i(str, C1642a.m8034a(str2, objArr));
        }
        return 0;
    }

    /* renamed from: v */
    public static int m143686v(String str, String str2, Object... objArr) {
        if (isLoggable(str, 2)) {
            return Log.v(str, C1642a.m8034a(str2, objArr));
        }
        return 0;
    }

    /* renamed from: w */
    public static int m143689w(String str, String str2, Object... objArr) {
        if (isLoggable(str, 5)) {
            return Log.w(str, C1642a.m8034a(str2, objArr));
        }
        return 0;
    }

    public static int wtf(String str, Throwable th, String str2, Object... objArr) {
        return Log.wtf(str, C1642a.m8034a(str2, objArr), th);
    }

    /* renamed from: d */
    public static int m143678d(String str, Throwable th, String str2, Object... objArr) {
        if (isLoggable(str, 3)) {
            return Log.d(str, C1642a.m8034a(str2, objArr), th);
        }
        return 0;
    }

    /* renamed from: e */
    public static int m143681e(String str, Throwable th, String str2, Object... objArr) {
        if (isLoggable(str, 6)) {
            return Log.e(str, C1642a.m8034a(str2, objArr), th);
        }
        return 0;
    }

    /* renamed from: i */
    public static int m143684i(String str, Throwable th, String str2, Object... objArr) {
        if (isLoggable(str, 4)) {
            return Log.i(str, C1642a.m8034a(str2, objArr), th);
        }
        return 0;
    }

    /* renamed from: v */
    public static int m143687v(String str, Throwable th, String str2, Object... objArr) {
        if (isLoggable(str, 2)) {
            return Log.v(str, C1642a.m8034a(str2, objArr), th);
        }
        return 0;
    }

    /* renamed from: w */
    public static int m143690w(String str, Throwable th, String str2, Object... objArr) {
        if (isLoggable(str, 5)) {
            return Log.w(str, C1642a.m8034a(str2, objArr), th);
        }
        return 0;
    }
}
