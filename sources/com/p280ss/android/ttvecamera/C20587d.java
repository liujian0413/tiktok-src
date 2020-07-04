package com.p280ss.android.ttvecamera;

import android.text.TextUtils;
import com.p280ss.android.ttvecamera.p916c.C20586c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.d */
public final class C20587d {

    /* renamed from: a */
    private static String f55623a = ((String) C20586c.m68163a("android.os.SystemProperties", "get", (Object[]) new String[]{"ro.mediatek.platform"}));

    /* renamed from: b */
    private static List<String> f55624b = new ArrayList();

    /* renamed from: c */
    private static boolean f55625c;

    /* renamed from: a */
    public static boolean m68166a() {
        if (!TextUtils.isEmpty(f55623a)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m68167b() {
        boolean z;
        if (!f55625c) {
            if (Collections.unmodifiableList(f55624b).indexOf(f55623a) < 0) {
                z = true;
            } else {
                z = false;
            }
            f55625c = z;
        }
        return f55625c;
    }

    static {
        Collections.addAll(f55624b, new String[]{"MT6571", "MT6595", "MT6795", "MT6572", "MT6752", "MT6582", "MT6735", "MT6592", "MT6753", "MT6589", "MT6755", "MT6735m", "MT6737T", "MT6580", "MT6750", "MT6750S", "MT6737", "MT6739", "MT6570", "MT6761"});
    }
}
