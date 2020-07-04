package com.p280ss.android.ugc.aweme.account.util;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Build.VERSION;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;

/* renamed from: com.ss.android.ugc.aweme.account.util.v */
public final class C22347v {

    /* renamed from: com.ss.android.ugc.aweme.account.util.v$a */
    static class C22348a {
        /* renamed from: a */
        public static ProgressDialog m73996a(Context context, boolean z) {
            int i;
            if (z) {
                i = 2;
            } else {
                i = 3;
            }
            return new ProgressDialog(context, i);
        }
    }

    /* renamed from: a */
    public static C11030a m73994a(Context context) {
        return new C11030a(context);
    }

    /* renamed from: b */
    public static ProgressDialog m73995b(Context context) {
        return m73993a(context, false);
    }

    /* renamed from: a */
    private static ProgressDialog m73993a(Context context, boolean z) {
        if (VERSION.SDK_INT >= 11) {
            return C22348a.m73996a(context, false);
        }
        return new ProgressDialog(context);
    }
}
