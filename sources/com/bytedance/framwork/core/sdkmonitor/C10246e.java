package com.bytedance.framwork.core.sdkmonitor;

import android.content.Context;
import com.p280ss.android.common.util.C6776h;
import com.taobao.android.dexposed.ClassUtils;

/* renamed from: com.bytedance.framwork.core.sdkmonitor.e */
public final class C10246e {

    /* renamed from: a */
    private static String f27849a;

    /* renamed from: b */
    private static String f27850b;

    /* renamed from: b */
    public static String m30372b(Context context) {
        if (f27849a == null) {
            f27849a = C6776h.m20949c(context);
        }
        return f27849a;
    }

    /* renamed from: a */
    public static String m30371a(Context context) {
        if (f27850b == null) {
            String replace = C6776h.m20949c(context).replace(context.getPackageName(), "p").replace(":", "_");
            f27850b = replace;
            f27850b = replace.replace(ClassUtils.PACKAGE_SEPARATOR, "_");
        }
        return f27850b;
    }
}
