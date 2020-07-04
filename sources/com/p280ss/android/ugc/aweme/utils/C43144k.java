package com.p280ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.ugc.appcontext.C6405d;

/* renamed from: com.ss.android.ugc.aweme.utils.k */
public final class C43144k {
    /* renamed from: a */
    public static void m136846a(String str) {
        Activity g = C6405d.m19984g();
        if (g != null) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags(268435456);
            intent.setDataAndType(C42972bf.m136420a((Context) g, str), "application/vnd.android.package-archive");
            g.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static boolean m136847a(Context context, String str) {
        try {
            if (context.getPackageManager().getPackageArchiveInfo(str, 1) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
