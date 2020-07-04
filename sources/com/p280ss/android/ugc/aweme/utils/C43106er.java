package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import com.bytedance.common.utility.C6319n;

/* renamed from: com.ss.android.ugc.aweme.utils.er */
public final class C43106er {
    /* renamed from: a */
    public static boolean m136726a(Context context, String str) {
        try {
            return m136727b(context, str);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m136727b(Context context, String str) {
        if (context == null || C6319n.m19593a(str)) {
            return false;
        }
        try {
            if (context.getPackageManager().getPackageInfo(str, 64) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
