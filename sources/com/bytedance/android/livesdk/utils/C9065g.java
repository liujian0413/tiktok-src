package com.bytedance.android.livesdk.utils;

import android.content.Context;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ttnet.p670a.C12925a;

/* renamed from: com.bytedance.android.livesdk.utils.g */
public final class C9065g {
    /* renamed from: a */
    public static boolean m27070a(String str) {
        if (C6319n.m19593a(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m27069a(Context context, String str) {
        return C12925a.m37625a(context).mo31413g(str);
    }
}
